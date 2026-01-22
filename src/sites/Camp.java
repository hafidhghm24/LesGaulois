package sites;

import personnages.*;

public class Camp {
	private Soldat commandant;
	private int nbunit = 80;
	public Soldat[] soldats = new Soldat[nbunit];
	private int nbSoldats = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}

	public Soldat getcommandant() {
		return commandant;
	}

	public void ajouterSoldat(Grade grade, String nom, int force) {
		Soldat soldatunit = new Soldat(grade, nom, force);
		if (nbSoldats < nbunit) {
			soldats[nbSoldats] = soldatunit;
			soldatunit.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());

			nbSoldats++;
		} else {
			soldats[nbSoldats - 1].parler("Désolé " + soldats[nbSoldats - 1].getNom() + " notre camp est complet !");
		}
	}

	public void afficherCamp() {
		for (int i = 0; i < nbSoldats; i++) {
			System.out.println(soldats[i].getNom());
		}
	}

	public void changerChef(Soldat newCommandant) {

		if (newCommandant.getGrade() != Grade.CENTURION) {
			newCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp");
		} else {
			commandant = newCommandant;
			commandant.parler("Moi " + commandant.getNom() + " je prends la direction du camp romain.");

		}

	}

}
