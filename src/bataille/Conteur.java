package bataille;


import bataille.Bataille;

public class Conteur {
	private String nom;
	
	public Conteur(String nom) {
		this.nom = nom;
	}
	public void conterHistoire(Bataille bataille) {
		System.out.println("je m'apelle " + nom + " et je vais vous conter une histoire");
	}
	

}
