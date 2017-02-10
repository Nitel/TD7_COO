package Personnages;

import Armes.*;

/**
 * Class PACKAGE_NAME.Personnages.Humain
 * @author vnahi
 * @project TD7
 */
public class Humain extends Personnage {
    protected String CouleursYeux;
    protected int Cout=10;
    public enum Type {Humain}

    public Humain(final String nom,final String couleursYeux) {
        super(nom);
        this.CouleursYeux=couleursYeux;
        Epee epee = new Epee();
        equiper("droite",epee);
    }

    public String getCouleursYeux() {
        return CouleursYeux;
    }

    public void setCouleursYeux(final String couleursYeux) {
        CouleursYeux = couleursYeux;
    }

    public int getCout() {
        return Cout;
    }

    public void setCout(final int cout) {
        Cout = cout;
    }
}
