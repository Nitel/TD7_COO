package Personnages;

import Armes.*;

/**
 * Class PACKAGE_NAME.Personnages.Orc
 * @author vnahi
 * @project TD7
 */
public class Orc extends Personnage {
    protected int TailleOreilles;
    protected int Cout;
    public enum Type {Orc}

    public Orc(final String nom, final int tailleoreilles) {
        super(nom);
        this.TailleOreilles= tailleoreilles;
        Epee epee = new Epee();
        equiper("droite",epee);
    }

    public int getTailleOreilles() {
        return TailleOreilles;
    }

    public void setTailleOreilles(final int tailleOreilles) {
        TailleOreilles = tailleOreilles;
    }

    public int getCout() {
        return Cout;
    }

    public void setCout(final int cout) {
        Cout = cout;
    }
}
