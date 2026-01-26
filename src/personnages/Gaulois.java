package personnages;

public class Gaulois extends Personnage{

	public Gaulois(String nom, int force) {
		super(nom,force);
	}
	
	@Override
	protected String donnerAuteur() {
		return "Le gaulois ";
		
	}
	
	public void boirPosion(int potionForce) {
		
	}
	
	
	//main C
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("bonjour a tous");
	
		
	}
	
}
