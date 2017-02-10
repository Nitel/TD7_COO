package Decorator;

import Armes.Arme;

/**
 * Class PACKAGE_NAME.Decorator.Amplification
 * @author vnahi
 * @project TD7_COO
 */
public class Amplification extends  ArmeAmelioration {
    public Arme arme;
    public int coeff;

    public Amplification(final Arme arme, final int coeff) {
        this.arme = arme;
        this.coeff = coeff;
    }

    public void protection(){
        arme.setProtection(arme.getProtection()+coeff);
    }

    public void force(){
        arme.setForce(arme.getForce()+coeff);
    }

    public void modifier(){
        arme.setProtection(arme.getProtection()+coeff);
        arme.setForce(arme.getForce()+coeff);
    }

}
