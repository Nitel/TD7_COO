package Armes;

/**
 * Class PACKAGE_NAME.Armes.Arme
 * @author vnahi
 * @project TD7
 */
public class Arme {
    public int force, protection;
    public String nom;
    public enum type {Bouclier,Epee,Dague}

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(final int force) {
        this.force = force;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(final int protection) {
        this.protection = protection;
    }
}
