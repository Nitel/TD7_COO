package Personnages;

import Armes.*;

/**
 * Class PACKAGE_NAME.Personnages.Orc
 * @author vnahi
 * @project TD7
 */
public class Orc extends Personnage {
    protected int TailleOreilles;
    protected Arme arme;

    public Orc(final String nom, final int tailleoreilles) {
        super(nom);
        this.TailleOreilles= tailleoreilles;
        Epee epee = new Epee();
        equiper("droite",epee);
    }
}
