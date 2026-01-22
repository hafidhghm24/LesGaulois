package personnages;

public class Soldat extends Romain{
	private Grade grade;
	
	public Soldat(Grade grade, String nom, int force) {
		super(nom,force);
		this.grade = grade;
	}
	
	public Grade getGrade() {
		return this.grade;
	}
	
}
