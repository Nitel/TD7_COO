package Groupes;

/**
 * Class Groupes.Bataillon
 * @author vnahi
 * @project TD7_COO
 */
public class Bataillon extends Unite {
    public enum  Type{Bataillon}
    public double Force =attaquer();
    public double Protection =proteger();


    public double attaquer(){
        double attaque=0;
        for (int i=0;i<Groupe.size();i++){
            attaque+=Groupe.get(i).getArme("droite").getForce();
        }
        return attaque*1.5;
    }

    public double proteger(){
        double protection=0;
        for (int i=0;i<Groupe.size();i++){
            protection+=Groupe.get(i).getArme("droite").getProtection();
        }
        return protection*1.5;
    }
}
