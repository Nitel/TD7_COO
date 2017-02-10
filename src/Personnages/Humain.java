package Personnages;

import Armes.*;

/**
 * Class PACKAGE_NAME.Personnages.Humain
 * @author vnahi
 * @project TD7
 */
public class Humain extends Personnage {
    protected String CouleursYeux;

    public Humain(final String nom,final String couleursYeux) {
        super(nom);
        this.CouleursYeux=couleursYeux;
        Epee epee = new Epee();
        equiper("droite",epee);
    }
}
