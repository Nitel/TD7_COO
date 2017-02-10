/**
 * Class PACKAGE_NAME.Tauren
 * @author vnahi
 * @project TD7
 */
public class Tauren extends Personnage {
    public int TailleCorne;

    public Tauren(final String nom, final Arme arme, final int taillecorne) {
        super(nom, arme);
        this.TailleCorne=taillecorne;
    }
}
