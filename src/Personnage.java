/**
 * Class PACKAGE_NAME.Personnage
 * @author vnahi
 * @project TD7
 */
public class Personnage {
    protected String Nom;
    protected int CoefVitalite =100;
    protected Arme arme;

    public Personnage(final String nom, final Arme arme) {
        Nom = nom;
        this.arme = arme;
    }

    public String getNom() {
        return Nom;
    }

    public int getCoefVitalite() {
        return CoefVitalite;
    }

    public Arme getArme() {
        return arme;
    }

    public void attaquer(Personnage personnage){
        personnage.CoefVitalite -= this.arme.force - this.arme.protection;
    }
}
