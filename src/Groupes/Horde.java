package Groupes;

/**
 * Class Groupes.Horde
 * @author vnahi
 * @project TD7_COO
 */
public class Horde extends Unite {
    public enum  Type{Horde}
    public double Force =attaquer();
    public double Protection =proteger();

    public double attaquer(){
        double attaque=0;
        for (int i=0;i<Groupe.size();i++){
            attaque+=Groupe.get(i).getArme("droite").getForce();
        }
        return attaque*0.75;
    }

    public double proteger(){
        double protection=0;
        for (int i=0;i<Groupe.size();i++){
            protection+=Groupe.get(i).getArme("droite").getProtection();
        }
        return protection*0.75;
    }
}
