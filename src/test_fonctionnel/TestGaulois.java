package test_fonctionnel;

import personnages.*;

public class TestGaulois {
    public static void main(String[] args) {

        Gaulois asterix = new Gaulois("Astérix", 5);
        Gaulois obelix = new Gaulois("Obélix", 5);
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 5);
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
        Gaulois agecanonix = new Gaulois("Agecanonix", 5);

        Soldat minus = new Soldat(Grade.SOLDAT, "Minus", 6);

        Druide panoramix = new Druide("Panoramix", 3, 2, 6);

        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.PLASTRON);


        panoramix.fabriquerPotion(3);

        panoramix.donnerPotion(asterix);
        panoramix.donnerPotion(obelix);
        panoramix.donnerPotion(assurancetourix);
        panoramix.donnerPotion(abraracourcix);
        panoramix.donnerPotion(agecanonix);


        asterix.parler("Bonjour à tous");


        minus.parler("UN GAU... UN GAUGAU...");

        while (!asterix.estaTerre() && !minus.estaTerre()) {
            asterix.frapper(minus);
        }
    }
}