package test_fonctionnel;

import personnages.*;

public class TestGaulois{
	//main A
	public static void main(String[] args) {
		//creer un gaulois
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 5);
		Gaulois Assurancetourix = new Gaulois("Assurancetourix", 5);
		Gaulois Abraracourcix = new Gaulois("Abraracourcix", 5);
		Gaulois Agecanonix = new Gaulois("Agecanonix", 5);
		
		asterix.parler("Bonjour à tous");
		
		//creer un Romain
		Romain minus = new Romain("Minus", 6);
		
		Druide druide = new Druide("Panoramix", 0, 2, 6);
		druide.fabriquerPotion(3);
		
		
		druide.donnerPotion(asterix);
		druide.donnerPotion(obelix);
		druide.donnerPotion(Assurancetourix);
		druide.donnerPotion(Abraracourcix);
		druide.donnerPotion(Agecanonix);
		
		minus.parler("UN GAU... UN GAUGAU...");

		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		
		
		
		
	}
}
