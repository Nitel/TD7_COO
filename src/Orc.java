/**
 * Class PACKAGE_NAME.Orc
 * @author vnahi
 * @project TD7
 */
public class Orc extends Personnage {
    protected int TailleOreilles;

    public Orc(final String nom, final Arme arme, final int tailleoreilles) {
        super(nom, arme);
        this.TailleOreilles= tailleoreilles;
    }
}
