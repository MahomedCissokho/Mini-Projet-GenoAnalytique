package geoanalytique.model;

/**
 * Représente un triangle isocèle dans un plan cartésien.
 * Un triangle isocèle est un triangle irrégulier où deux de ses côtés ont la même longueur.
 * Il hérite de la classe TriangleIrregulier.
 * 
 * @author Abdallah Victor Assolofo Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class TriangleIsocele extends TriangleIrregulier {
    // Pas d'attributs supplémentaires, car les côtés de même longueur sont déjà définis dans TriangleIrregulier
    
    /**
     * Constructeur par défaut de la classe TriangleIsocele.
     * Initialise les longueurs des côtés du triangle isocèle à 0.
     */
    public TriangleIsocele() {
        super(); // Appel au constructeur par défaut de la classe parente
    }

    /**
     * Constructeur avec paramètres de la classe TriangleIsocele.
     * Initialise les longueurs des côtés du triangle isocèle avec les valeurs spécifiées.
     * 
     * @param longueur_cote La longueur des côtés du triangle isocèle.
     */
    public TriangleIsocele(float longueur_cote, float longueur_cote3) {
        super(longueur_cote, longueur_cote, longueur_cote3); // Appel au constructeur avec paramètres de la classe parente
    }
}
