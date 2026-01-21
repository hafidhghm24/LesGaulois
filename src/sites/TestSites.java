package sites;

import personnages.*;


public class TestSites {
	public static void main(String[] args) {
		Gaulois chefGaulois = new Gaulois("Vercingétorix", 5);
		Soldat commandanRomain = new Soldat(Grade.CENTURION,"Minus", 2);
		
		Village village = new Village(chefGaulois);
		Camp camp = new Camp(commandanRomain);
		
		System.out.println("\nTEST CREATION CHEFS\n");
		chefGaulois.parler("Je suis un grand guerrier et je vais créer mon village");
		commandanRomain.parler("Je suis en charge de créer un nouveau camp romain.");
		
		System.out.println("\nTEST AJOUT SOLDAT\n");
		
		village.ajouterVillagois("Agecanonix", 1);
		village.ajouterVillagois("Assurancetourix", 2);
		village.ajouterVillagois("Astérix", 5);
		village.ajouterVillagois("Obelix", 15);
		village.ajouterVillagois("Prolix", 3);
		
		camp.ajouterSoldat(Grade.CENTURION, "Brutus", 5);
		camp.ajouterSoldat(Grade.SOLDAT, "Milexcus", 2);
		camp.ajouterSoldat(Grade.TESSERARIUS, "Tullius Octopus", 2);
		camp.ajouterSoldat(Grade.OPTIO, "Ballondebaudrus", 3);
		
		for(int i=0; i<3; i++) {
			camp.soldats[i].parler("Je mets mon épée au service de Rome dans le camp dirigé par"+village.getChef().getNom());
		}
		System.out.println("---------");
		for(int i=0; i<3; i++) {
			village.gaulois[i].parler("Je mets mon épée au service de Rome dans le camp dirigé par"+camp.getcommandant().getNom());
		}
		
	}
	

}
