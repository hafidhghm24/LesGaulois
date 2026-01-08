package personnages;

public class Gaulois {
	private String nom;
	private int force;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getnom() {
		return nom;
	}
	public void parler(String texte){
		System.out.println("Le gaulois "+ nom + " : « " + texte + " ». \n");
	}
	
	//main C
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getnom());
		
	}
	
}
