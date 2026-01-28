package personnages;

public class Gaulois extends Personnage{
	private double boost = 1.0;
	public Gaulois(String nom, int force) {
		super(nom,force);
	}
	
	@Override
	protected String donnerAuteur() {
		return "gaulois ";
		
	}
	
	public void boirePotion(int potionForce) {
		boost = potionForce;
	}
	
	@Override
	public void  frapper(Personnage ennemie) {
		int coupForce = (int)(force * boost/ 3 );
		if(!estaTerre()) {
			System.out.println(donnerAuteur() + getNom() + " donne un grand coup de force " + coupForce + " au " + ennemie.donnerAuteur() + " " + ennemie.getNom() + ".");
			ennemie.recevoirCoup(coupForce);
			if(boost> 1) {
				boost -= 0.5;
			}
			else {boost = 1;}
		}
		
	}
	
	
	//main C
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("bonjour a tous");
	
		
	}
	
}
