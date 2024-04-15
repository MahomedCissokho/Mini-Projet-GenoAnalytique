package geoanalytique.model;

/**
 * Représente un losange dans un plan cartésien.
 * Un losange est défini par la longueur de ses côtés.
 * Il hérite de la classe Polygone.
 * 
 * @author Abdallah Victor Assolofo Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Losange extends Polygone {
    protected float longueur_cote;

    /**
     * Constructeur avec paramètre de la classe Losange.
     * Initialise la longueur des côtés du losange.
     * @param longueur_cote La longueur des côtés du losange.
     */
    public Losange(float longueur_cote) {
        this.longueur_cote = longueur_cote;
    }

    /**
     * Getter pour la longueur des côtés du losange.
     * @return La longueur des côtés du losange.
     */
    public float getLongueurCote() {
        return longueur_cote;
    }

    /**
     * Setter pour la longueur des côtés du losange.
     * @param longueur_cote La nouvelle longueur des côtés du losange.
     */
    public void setLongueurCote(float longueur_cote) {
        this.longueur_cote = longueur_cote;
    }
}
