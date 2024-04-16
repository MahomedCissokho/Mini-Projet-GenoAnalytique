package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Cercle;
import geoanalytique.model.Droite;
import geoanalytique.util.Operation;

/**
 * La classe OperationCercle contient les méthodes spécifiques aux opérations sur les cercles.
 * Elle implémente l'interface Operation pour définir les opérations disponibles sur un cercle.
 * 
 * @author Abdallah Solofo Victor AICHA, Nana Katy AIDARA, Mahomed CISSOKHO,
 *         Fatima Tidiane DIA, Bassirou KANE
 */
public class OperationCercle implements Operation {
    private Cercle cercle;

    /**
     * Constructeur de la classe OperationCercle.
     * Il initialise l'objet OperationCercle avec le cercle donné en paramètre.
     * 
     * @param cercle Le cercle sur lequel les opérations seront effectuées.
     */
    public OperationCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    /**
     * Méthode pour calculer le périmètre du cercle.
     * 
     * @return Le périmètre du cercle.
     */
    public double calculerPerimetre() {
        return 2 * Math.PI * cercle.getRayon();
    }

    /**
     * Méthode pour calculer la surface du cercle.
     * 
     * @return La surface du cercle.
     */
    public double calculerSurface() {
        return Math.PI * cercle.getRayon() * cercle.getRayon();
    }
 /**
     * Cette methode renvoie le nom de l'operation 
     * @return "OperationCercle"
     */
    
     public String getTitle() {
        return "OperationCercle";
    }

    /**
     * Cette methode renvoie le nombre d'attributs de la classe
     * @return 1
     */
    public int getArite() {
        return 1;
    }

    /**
     * Cette methode permet de changer l'attribut Cercle.
     * @param num de type object
     * @param o de type object
     */
    public void setArgument(int num, Object o) {
        if (num == 1 && o instanceof Cercle) {
            this.cercle = (Cercle) o;
        }
        
    }

    /**
     * Cette methode permet de retourner le nom de l'attribut
     * @return "le nom de l'attribut"
     */
    public String getDescriptionArgument(int num) {
        if (num == 1)
            return "cercle";

        else return "";

    }
    /**
     * Cette methode permet de retourner la classe de l'attribut
     * @param num de type int
     * @return "La classe de l'attribut"
     */

    public class<?> getClassArgument(int num) {
        if (num == 1)
            return Cercle.Class;
    }

    /**
     * Cette methode permet de...
     */
    public Object calculer(){

    }
}
