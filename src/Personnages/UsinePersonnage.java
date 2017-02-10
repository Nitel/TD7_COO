package Personnages;

import Joueur.Joueur;

/**
 * Class Personnages.UsinePersonnage
 * @author vnahi
 * @project TD7_COO
 */
public class UsinePersonnage {
    public Personnage creerPersonnage(String nom, Personnage.Type type,Joueur joueur){
        Personnage personnage = null;
        switch (type){
            case Humain: personnage = new Humain(nom,"marron");joueur.bourse-=10; break;
            case Orc: personnage = new Orc(nom,12);joueur.bourse-=1;break;
            case Tauren: personnage = new Tauren(nom,12);joueur.bourse-=2;break;
            case Troll: personnage = new Troll(nom,"Duff");joueur.bourse-=5;break;
        }
        return personnage;
    }
}
