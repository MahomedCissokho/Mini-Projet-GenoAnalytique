package geoanalytique.model;

/**
 * Représente un point dans un plan cartésien.
 * Un point est défini par ses coordonnées (abscisse, ordonnée).
 * @author Abdallah Victor Assolofo Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Point extends GeoObject{
    protected float abscisse;
    protected float ordonnee;

     /**
     * Constructeur avec paramètres de la classe Point.
     * Initialise les coordonnées du point avec les valeurs spécifiées.
     * @param abscisse La coordonnée en abscisse du point.
     * @param ordonnee La coordonnée en ordonnée du point.
     */
    public Point(float abscisse, float ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    /**
     * Getter pour la coordonnée en abscisse du point.
     * @return La coordonnée en abscisse du point.
     */
    public float getAbscisse() {
        return abscisse;
    }

     /**
     * Setter pour la coordonnée en abscisse du point.
     * @param abscisse La nouvelle coordonnée en abscisse du point.
     */
    public void setAbscisse(float abscisse) {
        this.abscisse = abscisse;
    }

    /**
     * Getter pour la coordonnée en ordonnée du point.
     * @return La coordonnée en ordonnée du point.
     */
    public float getOrdonnee() {
        return ordonnee;
    }

    /**
     * Setter pour la coordonnée en ordonnée du point.
     * @param ordonnee La nouvelle coordonnée en ordonnée du point.
     */
    public void setOrdonnee(float ordonnee) {
        this.ordonnee = ordonnee;
    }
}
