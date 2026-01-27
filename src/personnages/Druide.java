package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
    private int nbPotions;
    private int potionForce;
    private int puissanceMin;
    private int puissanceMax;
    private Random random;

    public Druide(String nom, int force, int puissanceMin, int puissanceMax) {
        super(nom, force);
        this.puissanceMax = puissanceMax;
        this.puissanceMin = puissanceMin;
        nbPotions = 0;

        try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fabriquerPotion(int nbPotions) {
        this.nbPotions = nbPotions;
        // Utilise puissanceMin et puissanceMax !
        potionForce = random.nextInt(puissanceMax - puissanceMin + 1) + puissanceMin;
        parler("J'ai concocté " + nbPotions + " doses de potion magique. Elle a une force de " + potionForce + ".");
    }

    public void donnerPotion(Gaulois gaulois) {
        if (nbPotions <= 0) {
            parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
        } else if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else {
            gaulois.boirePotion(potionForce);
            parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
            nbPotions--;
        }
    }
}