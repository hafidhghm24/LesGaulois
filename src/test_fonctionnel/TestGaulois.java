package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois{
	//main A
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getnom());
		asterix.parler("heyyy");
	}
}
