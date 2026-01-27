package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte){
		System.out.println(donnerAuteur()+ nom +": « " + texte + " ».\r\n");
	}
	
	protected abstract String donnerAuteur();
	
	public void  frapper(Personnage ennemie) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + ennemie.getNom() + "\n");
		ennemie.recevoirCoup(force/3);
	}
	
	public void recevoirCoup(int force_coup) {
		force = force - force_coup;
		if (force <= 0) {
		    force = 0;
		    parler("J'abandonne...");
		} else {
		    parler("Aïe !");
		}
	}
	
	public int getForce() {
		return force;
	}
}
