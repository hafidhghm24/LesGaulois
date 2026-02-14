package bataille;

import personnages.*;
import sites.Camp;
import sites.Village;

public class Embuscade implements Bataille {
	private Village village;
	private Camp camp;
	private Gaulois[] promeneurs = new Gaulois[4];
	private Soldat[] soldats = new Soldat[2];
	
	public Embuscade(Village village, Camp camp) {
		this.village = village;
		this.camp = camp;
	}
	
	@Override
	public String decrireContexte() {
		return "Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.";
	}

	@Override
	public String choisirCombattants() {
		return "le combattant";
	}

	@Override
	public String preparerCombat() {
		return "preparerCombat";
	}

	@Override
	public String decrireCombat() {
		return "decrireCombat";
	}

	@Override
	public String donnerResultat() {
		return "donnerResultat";
	}
}
