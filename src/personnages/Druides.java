package personnages;

import java.security.SecureRandom;

public class Druide extends Gaulois{
	private Ingredient 
	private int potionForce;
	private Random random;
	
	public Druide(String nom, int force, int puissanceMin, int puissanceMax ) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
			} catch (Exception e) {
			e.printStackTrace();
			}
		
	}
	
	public void donnerPotion(Gaulois gaulois) {
		potionForce = random(2,6);
		if(gaulois.getNom() != "Obélix") {
			gaulois.boirPosion(potionForce);;
			parler("tien "+ gaulois.getNom() + " un peu de potion magique.");
		}
		else {
			parler("Non, Obélix Non !... Et tu le sais très bien !");
		}
	}
	
	
	
	
}
