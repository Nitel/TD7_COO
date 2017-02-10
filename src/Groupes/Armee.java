package Groupes;

import Personnages.Personnage;

/**
 * Class Groupes.Armee
 * @author vnahi
 * @project TD7_COO
 */
public class Armee extends Unite {
    public Personnage General;
    public Bataillon Bataillon;
    public enum  Type{Armee}
    public double Force = attaquer();
    public double Protection = proteger();


    public double attaquer(){
        double attaque=0;
        for (int i=0;i<Bataillon.Groupe.size();i++){
            attaque+= Bataillon.Groupe.get(i).getArme("droite").getForce();
        }
        return attaque+General.getArme("droite").getForce();
    }

    public double proteger(){
        double protection=0;
        for (int i=0;i<Bataillon.Groupe.size();i++){
            protection+= Bataillon.Groupe.get(i).getArme("droite").getProtection();
        }
        return protection+General.getArme("droite").getProtection();
    }
}
