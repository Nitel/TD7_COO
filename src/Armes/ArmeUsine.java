package Armes;

/**
 * Class Armes.ArmeUsine
 * @author vnahi
 * @project TD7_COO
 */
public class ArmeUsine {
    public Arme creerArme(String nom, Arme.type type){
        Arme arme = null;
        arme.setNom(nom);
        switch (type){
            case Bouclier: arme = new Bouclier();break;
            case Dague: arme = new Dague(); break;
            case Epee: arme = new Epee();break;
        }
        return arme;
    }
}
