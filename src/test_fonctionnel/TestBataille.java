package test_fonctionnel;

import personnages.*;
import sites.*;
import bataille.*;

public class TestBataille {
    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
        Village village = new Village(abraracourcix);

        Gaulois agecanonix = new Gaulois("Agecanonix", 1);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
        Gaulois asterix = new Gaulois("Astérix", 5);
        Gaulois obelix = new Gaulois("Obelix", 15);
        Gaulois cetautomatix = new Gaulois("Cétautomatix", 8);
        Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 8);

        village.ajouterVillagois(agecanonix.getNom(), agecanonix.getForce());
        village.ajouterVillagois(assurancetourix.getNom(), assurancetourix.getForce());
        village.ajouterVillagois(asterix.getNom(), asterix.getForce());
        village.ajouterVillagois(obelix.getNom(), obelix.getForce());
        village.ajouterVillagois(cetautomatix.getNom(),cetautomatix.getForce());
        village.ajouterVillagois(ordralfabetix.getNom(),ordralfabetix.getForce());


        Soldat chorus = new Soldat(Grade.CENTURION, "Chorus", 4);
        Camp camp = new Camp(chorus);

        Soldat minus = new Soldat(Grade.SOLDAT, "Minus", 2);
        Soldat brutus = new Soldat(Grade.CENTURION, "Brutus", 5);
        Soldat milexcus = new Soldat(Grade.SOLDAT, "Milexcus", 2);
        Soldat tullius = new Soldat(Grade.TESSERARIUS, "Tullius Octopus", 2);
        Soldat ballondebaudrus = new Soldat(Grade.OPTIO,"Ballondebaudrus", 3 );
        Soldat quintilius = new Soldat(Grade.SOLDAT, "Quintilius", 2);

        camp.ajouterSoldat(brutus.getGrade(), brutus.getNom(), brutus.getForce());
        camp.ajouterSoldat(milexcus.getGrade(), milexcus.getNom(), milexcus.getForce());
        camp.ajouterSoldat(tullius.getGrade(), tullius.getNom(), tullius.getForce());
        camp.ajouterSoldat(ballondebaudrus.getGrade(), ballondebaudrus.getNom(), ballondebaudrus.getForce());
        camp.ajouterSoldat(minus.getGrade(), minus.getNom(), minus.getForce());
        camp.ajouterSoldat(quintilius.getGrade(), quintilius.getNom(), quintilius.getForce());

        Conteur goscinny = new Conteur("Goscinny");
        Embuscade embuscade = new Embuscade(village, camp);


        goscinny.conterHistoire(embuscade);
    }
}