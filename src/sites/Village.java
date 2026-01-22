package sites;
import personnages.*;

public class Village {
	private Gaulois chef;
	private int nbunit = 4;
	public Gaulois[] gaulois = new Gaulois[nbunit];
	private int nbVillagois = 0;
	
	public Village (Gaulois chef) {
		this.chef = chef;
	}
	public Gaulois getChef(){
		return chef;
	}
	public void ajouterVillagois(String nom, int force) {
		Gaulois gauloi = new Gaulois(nom, force);
		if (nbVillagois<nbunit) {
			gaulois[nbVillagois] = gauloi;
			gauloi.parler("Bienvenue " + gauloi.getNom() + " !");
			
			nbVillagois++;
		}
		else {
			gauloi.parler("Désolé " + gauloi.getNom()+" mon village est déjà bien rempli. ");
		}
		
	}

}
