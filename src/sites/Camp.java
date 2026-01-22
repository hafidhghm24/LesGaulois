package sites;

import personnages.*;

public class Camp {
	private Soldat commandant;
	private int nbunit = 3;
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
			soldats[nbSoldats-1].parler("Désolé " + soldats[nbSoldats-1].getNom() + " notre camp est complet !");
		}
	}

	public void afficherCamp() {

	}

}
