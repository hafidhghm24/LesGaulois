package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;
	
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte){
		System.out.println("Le " + donnerAuteur()+ nom +": « " + texte + " ».\r\n");
	}
	
	protected abstract String donnerAuteur();
	
	public void  frapper(Personnage ennemie) {
		if(!ennemie.estaTerre()) {
			System.out.println(nom + " envoie un grand coup dans la mâchoire de " + ennemie.getNom() + "\n");
			ennemie.recevoirCoup(force/3);
		}
		
	}
	
	protected void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force <= 0) {
		    force = 0;
		    parler("J'abandonne...");
		    estaTerre();
		} else {
		    parler("Aïe !");
		    estaTerre();
		}
	}
	
	public boolean estaTerre() {
		return this.force == 0;
	}
}
