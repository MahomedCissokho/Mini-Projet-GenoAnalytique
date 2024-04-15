package geoanalytique.model;

/**
 * Représente un triangle équilatéral dans un plan cartésien.
 * Un triangle équilatéral est un triangle ayant trois côtés de même longueur.
 * Il hérite de la classe TriangleIrregulier.
 * 
 * @author Abdallah Victor Assolofo Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class TriangleEquilateral extends TriangleIrregulier {
    // Pas d'attributs supplémentaires, car les côtés du triangle sont déjà définis dans TriangleIrregulier
    
    /**
     * Constructeur par défaut de la classe TriangleEquilateral.
     * Initialise les longueurs des côtés du triangle équilatéral à 0.
     */
    public TriangleEquilateral() {
        super(); // Appel au constructeur par défaut de la classe parente
    }

    /**
     * Constructeur avec paramètre de la classe TriangleEquilateral.
     * Initialise les longueurs des côtés du triangle équilatéral avec la valeur spécifiée.
     * 
     * @param longueur_cote La longueur des côtés du triangle équilatéral.
     */
    public TriangleEquilateral(float longueur_cote) {
        super(longueur_cote, longueur_cote, longueur_cote); // Appel au constructeur avec paramètres de la classe parente
    }
}
