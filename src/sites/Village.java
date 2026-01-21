package sites;
import personnages.*;

public class Village {
	private Gaulois chef;
	public Gaulois[] gaulois = new Gaulois[50];
	private int nbVillagois = 0;
	
	public Village (Gaulois chef) {
		this.chef = chef;
	}
	public Gaulois getChef(){
		return chef;
	}
	public void ajouterVillagois(String nom, int force) {
		if (nbVillagois<50) {
			gaulois[nbVillagois] = new Gaulois(nom, force);
			nbVillagois++;
		}
		
	}

}
