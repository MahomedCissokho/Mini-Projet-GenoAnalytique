package geoanalytique.model;

/**
 * Représente un triangle rectangle dans un plan cartésien.
 * Un triangle rectangle est un triangle irrégulier ayant un angle droit.
 * Il hérite de la classe TriangleIrregulier.
 * 
 * @author Abdallah Victor Assolofo Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class TriangleRectangle extends TriangleIrregulier {
    // Pas d'attributs supplémentaires, car les côtés du triangle sont déjà définis dans TriangleIrregulier
    
    /**
     * Constructeur par défaut de la classe TriangleRectangle.
     * Initialise les longueurs des côtés du triangle rectangle à 0.
     */
    public TriangleRectangle() {
        super(); // Appel au constructeur par défaut de la classe parente
    }

    /**
     * Constructeur avec paramètres de la classe TriangleRectangle.
     * Initialise les longueurs des côtés du triangle rectangle avec les valeurs spécifiées.
     * 
     * @param longueur_cote1 La longueur du premier côté du triangle rectangle.
     * @param longueur_cote2 La longueur du deuxième côté du triangle rectangle.
     * @param longueur_cote3 La longueur du troisième côté du triangle rectangle.
     */
    public TriangleRectangle(float longueur_cote1, float longueur_cote2, float longueur_cote3) {
        super(longueur_cote1, longueur_cote2, longueur_cote3); // Appel au constructeur avec paramètres de la classe parente
    }
}
