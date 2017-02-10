package Groupes;

import Personnages.Personnage;

import java.util.ArrayList;

/**
 * Class Groupes.Unite
 * @author vnahi
 * @project TD7_COO
 */
public class Unite {
    public enum Type {Horde, Bataillon, Armee}
    public ArrayList<Personnage> Groupe;
    public double Force =attaquer();
    public double Protection =proteger();

    private double proteger() {
        return 0;
    }

    public double attaquer(){return 0;}
}
