/**
 * Class PACKAGE_NAME.Personnage
 * @author vnahi
 * @project TD7
 */
public class Personnage {
    protected String Nom;
    protected int CoefVitalite;
    protected Arme arme;

    public Personnage(final String nom, final int coefVitalite, final Arme arme) {
        Nom = nom;
        CoefVitalite = coefVitalite;
        this.arme = arme;
    }

}