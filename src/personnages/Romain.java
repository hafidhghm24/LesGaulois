package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte){
		System.out.println("Le Romain "+ nom + " : « " + texte + " ». \n");
	}
	
	public void recevoirCoup(int force_coup) {
		force = force - force_coup;
		if (force < 0) {
			force = 0;
		}
		else if(force < 1){
			parler("J'abandonne...");
		}
		else {
			parler("Aîe !");
		}
	}
	
	
	
}
