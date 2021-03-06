package Personnages;

import Armes.Dague;

/**
 * Class PACKAGE_NAME.Elfe
 * @author vnahi
 * @project TD7
 */
public class Troll extends Personnage {
    protected String NomBiere;
    protected int Cout=5;
    public enum Type {Troll}

    public Troll(final String nom, final String nomBiere) {
        super(nom);
        this.NomBiere=nomBiere;
        Dague dague = new Dague();
        equiper("droite",dague);
    }

    public String getNomBiere() {
        return NomBiere;
    }

    public void setNomBiere(final String nomBiere) {
        NomBiere = nomBiere;
    }

    public int getCout() {
        return Cout;
    }

    public void setCout(final int cout) {
        Cout = cout;
    }
}
