package geoanalytique.model;

/**
 * Représente un cercle dans un plan cartésien.
 * Un cercle est défini par son rayon et son centre.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Cercle extends Ellipse {
    protected float rayon;

    /**
     * Constructeur avec paramètres de la classe Cercle.
     * Initialise le rayon et le centre du cercle avec les valeurs spécifiées.
     * @param rayon Le rayon du cercle.
     * @param centre Le centre du cercle.
     */
    public Cercle(float rayon, Point centre) {
        super(rayon, rayon, centre);
        this.rayon = rayon;
    }

        /**
     * Getter pour le rayon du cercle.
     * @return Le rayon du cercle.
     */
    public float getRayon() {
        return rayon;
    }
     /**
     * Setter pour le rayon du cercle.
     * @param rayon Le nouveau rayon du cercle.
     */
    public void setRayon(float rayon) {
        this.rayon = rayon;
    }
}
