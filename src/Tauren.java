/**
 * Class PACKAGE_NAME.Tauren
 * @author vnahi
 * @project TD7
 */
public class Tauren extends Personnage {
    public int TailleCorne;

    public Tauren(final String nom, final int coefVitalite, final Arme arme, final int taillecorne) {
        super(nom, coefVitalite, arme);
        this.TailleCorne=taillecorne;
    }
}
