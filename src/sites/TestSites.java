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
		
		
		
		camp.ajouterSoldat(Grade.CENTURION, "Brutus", 5);
		camp.ajouterSoldat(Grade.SOLDAT, "Milexcus", 2);
		camp.ajouterSoldat(Grade.TESSERARIUS, "Tullius Octopus", 2);
		camp.ajouterSoldat(Grade.OPTIO, "Ballondebaudrus", 3);
		
		village.ajouterVillagois("Agecanonix", 1);
		village.ajouterVillagois("Assurancetourix", 2);
		village.ajouterVillagois("Astérix", 5);
		village.ajouterVillagois("Obelix", 15);
		village.ajouterVillagois("Prolix", 3);
		
		System.out.println("\nTEST AFFICHAGE VILLAGE\n");
		village.afficherVillageois();
		
		System.out.println("\nTEST AFFICHAGE CAMP\n");
		camp.afficherCamp();
		
		System.out.println("\nTEST CHANGEMENT DE CHEF\n");
		Gaulois newChefGaulois = new Gaulois("Abraracourcix",5);
		village.changerChef(newChefGaulois);
		
		Soldat newCommandant = new Soldat(Grade.SOLDAT, "Briseradius", 4);
		camp.changerChef(newCommandant);
		Soldat newCommandant2 = new Soldat(Grade.CENTURION, "Chorus", 4);
		camp.changerChef(newCommandant2);
		
		
		
		
		
		
		
		
		
	}
	

}
