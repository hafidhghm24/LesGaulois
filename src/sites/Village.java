package sites;

import personnages.*;

public class Village {
	private Gaulois chef;
	private int nbunit = 50;
	public Gaulois[] gaulois = new Gaulois[nbunit];
	private int nbVillagois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillagois(String nom, int force) {
		Gaulois gauloi = new Gaulois(nom, force);
		if (nbVillagois < nbunit) {
			gaulois[nbVillagois] = gauloi;
			nbVillagois++;
			chef.parler("Bienvenue " + gauloi.getNom() + " !");
		} else {
			chef.parler("Désolé " + gauloi.getNom() + " mon village est déjà bien rempli. ");
		}

	}

	public void afficherVillageois() {
		for (int i = 0; i < nbVillagois; i++) {
			System.out.println(gaulois[i].getNom());

		}
	}

	public void changerChef(Gaulois newChef) {

		chef.parler("Je laisse mon grand bouclier au grand " + newChef.getNom());
		chef = newChef;
		chef.parler("Merci !");
	}

}
