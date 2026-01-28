package personnages;

public class Romain extends Personnage{

	public Romain(String nom, int force) {
		super(nom,force);
	}
	
	@Override
	protected String donnerAuteur() {
		return "Romain ";
	}
	
	@Override
	public void  frapper(Personnage ennemie) {
		if(!estaTerre()) {
			System.out.println("Le " + donnerAuteur() + getNom() + " donne un grand coup de force " + force + " au " + ennemie.donnerAuteur() + " " + ennemie.getNom() + ".");
			ennemie.recevoirCoup(force/3);
		}
		
	}
	
	
	
}
