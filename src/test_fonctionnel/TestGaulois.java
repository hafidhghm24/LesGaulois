package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois{
	//main A
	public static void main(String[] args) {
		//creer un gaulois
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getnom());
		asterix.parler("heyyy");
		
		//creer un Romain
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU");
		
		int i; 
		for(i=0; i<2; i++) {
			
			minus.recevoirCoup(3);
		}
	}
}
