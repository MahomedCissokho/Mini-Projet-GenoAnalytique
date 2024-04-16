package geoanalytique.model;

/**
 * Représente un carré dans un plan cartésien.
 * Un carré est défini par la longueur de ses côtés, tous égaux.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Katy Aidara
 * @author Mohamed Cissokho
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Carre extends Rectangle {
    protected float longueur_cote;

    /**
     * Constructeur avec paramètre de la classe Carre.
     * Initialise la longueur du côté du carré.
     * @param longueurCote La longueur du côté du carré.
     */
    public Carre(float longueurCote) {
        super(longueurCote, longueurCote);
      
    }


/**
     * Getter pour la longueur des côtés du carré.
     * @return La longueur des côtés du carré.
     */
    public float getLongueurCote() {
        return longueur_cote;
    }

    /**
     * Setter pour la longueur des côtés du carré.
     * Met à jour la longueur des côtés du carré avec la valeur spécifiée.
     * @param longueur_cote La nouvelle longueur des côtés du carré.
     */
    public void setLongueurCote(float longueur_cote) {
        this.longueur_cote = longueur_cote;
    }
}
