package Groupes;

import Joueur.Joueur;
import Personnages.*;

/**
 * Class Groupes.UsineGroupe
 * @author vnahi
 * @project TD7_COO
 */
public class UsineGroupe {
    public Unite creerGroupe(String nom, Unite.Type typeu, Joueur joueur,Personnage.Type typep,int nb){
        UsinePersonnage usinePersonnage = new UsinePersonnage();
        Unite unite = null;
        Personnage personnage = null;
        String nom1 = null;
        switch (typep){
            case Troll:nom1="Troll";
            case Tauren:nom1="Tauren";
            case Orc:nom1="Orc";
            case Humain:nom1="Humain";
        }
        int i;
        switch (typeu){
            case Armee:
                personnage=usinePersonnage.creerPersonnage("General"+nom1,typep,joueur);
                for (i=1;i<nb;i++){
                personnage=usinePersonnage.creerPersonnage(nom1+i,typep,joueur);
                unite.Groupe.add(personnage);
            }
                break;

            case Bataillon:
                for (i=0;i<nb;i++){
                    personnage=usinePersonnage.creerPersonnage(nom1+i,typep,joueur);
                    unite.Groupe.add(personnage);
                }
                break;
            case Horde:for (i=0;i<nb;i++){
                personnage=usinePersonnage.creerPersonnage(nom1+i,typep,joueur);
                unite.Groupe.add(personnage);
            }
            break;

        }
        return unite;
    }
}
