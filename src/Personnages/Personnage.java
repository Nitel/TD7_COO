package Personnages;

import Armes.*;

import java.util.HashMap;

/**
 * Class PACKAGE_NAME.Personnages.Personnage
 * @author vnahi
 * @project TD7
 */
public class Personnage {
    protected String Nom;
    protected int CoefVitalite =100;
    protected HashMap<String,Arme> armeHashMap = new HashMap<>();

    public Personnage(final String nom) {
        Nom = nom;
    }

    public void attaquer(Personnage personnage){
        if (this.armeHashMap.get("droite").getForce()>this.armeHashMap.get("droite").getProtection())
            personnage.CoefVitalite -= this.armeHashMap.get("droite").getForce() - this.armeHashMap.get("droite").getProtection();
    }

    public boolean estMort(){
        if(this.CoefVitalite<=0)
            return true;
        else
            return false;
    }

    public void equiper(String main,Arme arme){
        armeHashMap.put(main,arme);
    }

    public void desequiper(String main){
        armeHashMap.remove(main);
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(final String nom) {
        Nom = nom;
    }

    public int getCoefVitalite() {
        return CoefVitalite;
    }

    public void setCoefVitalite(final int coefVitalite) {
        CoefVitalite = coefVitalite;
    }

    public Arme getArme(String main) {
        return this.armeHashMap.get(main);
    }

    public void setArme(final Arme arme, String main) {
        this.armeHashMap.put(main,arme);
    }

    public HashMap<String, Arme> getArmeHashMap() {
        return armeHashMap;
    }

    public void setArmeHashMap(final HashMap<String, Arme> armeHashMap) {
        this.armeHashMap = armeHashMap;
    }
}
