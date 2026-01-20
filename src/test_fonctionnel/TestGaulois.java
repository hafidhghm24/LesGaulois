package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois{
	//main A
	public static void main(String[] args) {
		//creer un gaulois
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("bonjour a tous");
		
		//creer un Romain
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");

		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		
		
		
		
	}
}
