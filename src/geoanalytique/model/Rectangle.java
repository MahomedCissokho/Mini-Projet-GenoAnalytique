package geoanalytique.model;

/**
 * Représente un rectangle dans un plan cartésien.
 * Un rectangle est défini par sa longueur et sa largeur.
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Rectangle extends Polygone {
    private float longueur;
    private float largeur ;

    /**
     * Constructeur avec paramètres de la classe Rectangle.
     * Initialise la longueur et la largeur du rectangle avec les valeurs spécifiées.
     * @param longueur La longueur du rectangle.
     * @param largeur La largeur du rectangle.
     */
    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    /**
     * Getter pour la longueur du rectangle.
     * @return La longueur du rectangle.
     */
    public float getLongueur() {
        return longueur;
    }

    /**
     * Setter pour la longueur du rectangle.
     * @param longueur La nouvelle longueur du rectangle.
     */
    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    /**
     * Getter pour la largeur du rectangle.
     * @return La largeur du rectangle.
     */
    public float getLargeur() {
        return largeur;
    }

    /**
     * Setter pour la largeur du rectangle.
     * @param largeur La nouvelle largeur du rectangle.
     */
    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
}
