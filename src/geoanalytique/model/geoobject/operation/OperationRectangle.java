package geoanalytique.model.geoobject.operation;
import geoanalytique.model.Rectangle;
import geoanalytique.util.Operation;
/**
 * La classe OperationRectangle contient les méthodes spécifiques aux opérations sur les rectangles.
 * 
 * @author Abdallah Solofo Victor AICHA,Nana Katy AIDARA, Mahomed CISSOKHO, 
 * Fatima Tidiane DIA, Bassirou KANE
 */

public class OperationRectangle implements Operation {
    Rectangle rectangle;
    /**
     * Constructeur de la classe OperationRectangle.
     * Il initialise l'objet OperationRectangle avec le rectangle donné en paramètre.
     * 
     * @param rectangle Le rectangle sur lequel les opérations seront effectuées.
     */
    public OperationRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
     /**
     * Méthode pour calculer l'aire du rectangle.
     * 
     * @return L'aire du rectangle.
     */
    public double calculerAire() {
        return rectangle.getLongueur() * rectangle.getLargeur();
    }

    /**
     * Méthode pour calculer le périmètre du rectangle.
     * 
     * @return Le périmètre du rectangle.
     */
    public double calculerPerimetre() {
        return 2 * (rectangle.getLongueur() + rectangle.getLargeur());
    }

     /**
     * Cette methode renvoie le nom de l'operation 
     * @return "OperationRectangle"
     */
    
     public String getTitle() {
        return "OperationRectangle";
    }

    /**
     * Cette methode renvoie le nombre d'attributs de la classe
     * @return 1
     */
    public int getArite() {
        return 1;
    }

    /**
     * Cette methode permet de changer l'attribut Rectangle.
     * @param num de type object
     * @param o de type object
     */
    public void setArgument(int num, Object o) {
        if (num == 1 && o instanceof Rectangle) {
            this.rectangle = (Rectangle) o;
        }
        
    }

    /**
     * Cette methode permet de retourner le nom de l'attribut
     * @return "le nom de l'attribut"
     */
    public String getDescriptionArgument(int num) {
        if (num == 1)
            return "rectangle";

        else return "";

    }
    /**
     * Cette methode permet de retourner la classe de l'attribut
     * @param num de type int
     * @return "La classe de l'attribut"
     */

    public class<?> getClassArgument(int num) {
        if (num == 1)
            return Rectangle.Class;
    }

    /**
     * Cette methode permet de...
     */
    public Object calculer(){

    }
    
}
