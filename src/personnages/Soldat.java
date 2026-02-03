package personnages;

public class Soldat extends Romain {
    private Grade grade;
    private Equipement[] equipements = new Equipement[3];
    private int nbEquipements = 0;

    public Soldat(Grade grade, String nom, int force) {
        super(nom, force);
        this.grade = grade;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void sEquiper(Equipement equip) {
        for (int i = 0; i < nbEquipements; i++) {
            if (equipements[i] == equip) {
                System.out.println(getNom() + " possède déjà un " + equip);
                return;
            }
        }

        if (nbEquipements < 3) {
            equipements[nbEquipements] = equip;
            nbEquipements++;
            System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equip.toString().toLowerCase() + ".");
        }
    }

    @Override
    public void recevoirCoup(int forceCoup) {
        for (int i = 0; i < nbEquipements; i++) {
            int absorption = 0;

            switch (equipements[i]) {
                case BOUCLIER:
                    absorption = 3;
                    break;
                case CASQUE:
                    absorption = 2;
                    break;
                case PLASTRON:
                    absorption = 3;
                    break;
            }

            System.out.println("Le " + equipements[i].toString().toLowerCase() + " absorbe " + absorption + " du coup");
            forceCoup -= absorption;
        }

        if (forceCoup < 0) {
            forceCoup = 0;
        }

        super.recevoirCoup(forceCoup);
    }

    @Override
    public void parler(String texte) {
        System.out.println("Le soldat " + getNom() + " de grade " + grade + " : « " + texte + " ».\n");
    }
    
    @Override
    protected String donnerAuteur() {
        return "soldat ";
    }
}