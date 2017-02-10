/**
 * Created by valentinL on 10/02/2017.
 */
public class Main {

    public static void main(String args[]){


        Tauren diablon = new Tauren("Diablon", 100, Bouclier, 15); // fais gaffe a l'attribut arme
        Orc azag = new Orc("Azag", 100, /*arme*/, /*mettre attribut "final String tailleOreilles" dans Orc pour mettre taille oreilles ici*/);

        diablon.attaquer(azag);
        azag.attaquer(diablon);




    }
}