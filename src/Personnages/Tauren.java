package Personnages;

import Armes.*;

/**
 * Class PACKAGE_NAME.Personnages.Tauren
 * @author vnahi
 * @project TD7
 */
public class Tauren extends Personnage {
    public float TailleCorne;
    public enum Type {Tauren}
    protected int Cout=2;

    public Tauren(final String nom, final float taillecorne) {
        super(nom);
        TailleCorne=taillecorne;
        Bouclier bouclier=new Bouclier();
        equiper("droite",bouclier);

    }

    public float getTailleCorne() {
        return TailleCorne;
    }

    public void setTailleCorne(final float tailleCorne) {
        TailleCorne = tailleCorne;
    }

    public int getCout() {
        return Cout;
    }

    public void setCout(final int cout) {
        Cout = cout;
    }
}
