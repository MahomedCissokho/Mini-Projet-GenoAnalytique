package geoanalytique.model;
import java.util.List;

/**
 * Représente une droite dans un plan cartésien.
 * Une droite est définie par son coefficient directeur et son ordonnée à l'origine.
 * Elle peut également contenir une liste de points.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Droite extends GeoObject{
    protected float ordonnee_origine ;
    protected float coefficient_directeur;
    protected List<Point> points ;

/**
     * Constructeur avec paramètres de la classe Droite.
     * Initialise l'ordonnée à l'origine et le coefficient directeur de la droite.
     * @param ordonnee_origine L'ordonnée à l'origine de la droite.
     * @param coefficient_directeur Le coefficient directeur de la droite.
     */
    public Droite(float ordonnee_origine, float coefficient_directeur) {
        this.ordonnee_origine = ordonnee_origine;
        this.coefficient_directeur = coefficient_directeur;
    }
 /**
     * Getter pour l'ordonnée à l'origine de la droite.
     * @return L'ordonnée à l'origine de la droite.
     */
    public float getOrdonneeOrigine() {
        return ordonnee_origine;
    }

    /**
     * Setter pour l'ordonnée à l'origine de la droite.
     * @param ordonnee_origine La nouvelle ordonnée à l'origine de la droite.
     */
    public void setOrdonneeOrigine(float ordonnee_origine) {
        this.ordonnee_origine = ordonnee_origine;
    }

     /**
     * Getter pour le coefficient directeur de la droite.
     * @return Le coefficient directeur de la droite.
     */
    public float getCoefficientDirecteur() {
        return coefficient_directeur;
    }

    /**
     * Setter pour le coefficient directeur de la droite.
     * @param coefficient_directeur Le nouveau coefficient directeur de la droite.
     */
    public void setCoefficientDirecteur(float coefficient_directeur) {
        this.coefficient_directeur = coefficient_directeur;
    }

     /**
     * Getter pour la liste des points représentant la droite.
     * @return La liste des points représentant la droite.
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     * Setter pour la liste des points représentant la droite.
     * @param points La nouvelle liste des points représentant la droite.
     */
    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
