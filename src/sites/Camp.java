package sites;
import personnages.*;

public class Camp{
	private Soldat commandant;
	public Soldat[] soldats = new Soldat[80];
	private int nbSoldats = 0;
	
	public Camp (Soldat commandant) {
		this.commandant = commandant;
	}
	public Soldat getcommandant(){
		return commandant;
	}
	public void ajouterSoldat(Grade grade, String nom, int force) {
		if (nbSoldats<80) {
			soldats[nbSoldats] = new Soldat(grade, nom, force);
			nbSoldats++;
		}
		
	}
	
}
