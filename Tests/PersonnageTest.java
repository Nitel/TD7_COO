import Armes.Arme;
import Armes.ArmeUsine;
import Decorator.Amplification;
import Decorator.Enchantement;
import Personnages.Orc;
import Personnages.Tauren;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author vnahi
 * @package Personnages
 */
public class PersonnageTest {

    @Test
    public void scenario() throws Exception {
        Tauren Diablon = new Tauren("Diablon",15);
        Orc Azag = new Orc("Azag",5);
        Diablon.attaquer(Azag);
        assertEquals(100,Azag.getCoefVitalite());
        Azag.attaquer(Diablon);
        assertEquals(95,Diablon.getCoefVitalite());
        Enchantement enchantement = new Enchantement(Diablon.getArme("droite"),2);
        Diablon.attaquer(Azag);
        assertEquals(95,Azag.getCoefVitalite());
        Amplification amplification = new Amplification(Diablon.getArme("droite"),3);
        Diablon.attaquer(Azag);
        assertEquals(87,Azag.getCoefVitalite());
        ArmeUsine armeUsine = new ArmeUsine();
        armeUsine.creerArme("Excalibur", Arme.type.Epee);
    }
}