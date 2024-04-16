package geoanalytique.model;

/**
 * Représente un triangle irrégulier dans un plan cartésien.
 * Un triangle irrégulier est défini par les longueurs de ses côtés.
 * Il hérite de la classe Polygone.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Katy Aidara
 * @author Mohamed Cissokho
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class TriangleIrregulier extends Polygone {
    protected float longueur_cote1;
    protected float longueur_cote2;
    protected float longueur_cote3;

    /**
     * Constructeur par défaut de la classe TriangleIrregulier.
     * Initialise les longueurs des côtés du triangle à 0.
     */
    
     public TriangleIrregulier() {
        this.longueur_cote1 = 0;
        this.longueur_cote2 = 0;
        this.longueur_cote3 = 0;
    }
    /**
     * Constructeur avec paramètres de la classe TriangleIrregulier.
     * Initialise les longueurs des côtés du triangle avec les valeurs spécifiées.
     * 
     * @param longueur_cote1 La longueur du premier côté du triangle.
     * @param longueur_cote2 La longueur du deuxième côté du triangle.
     * @param longueur_cote3 La longueur du troisième côté du triangle.
     */
    public TriangleIrregulier(float longueur_cote1, float longueur_cote2, float longueur_cote3) {
        this.longueur_cote1 = longueur_cote1;
        this.longueur_cote2 = longueur_cote2;
        this.longueur_cote3 = longueur_cote3;
    }

    /**
     * Getter pour la longueur du premier côté du triangle.
     * 
     * @return La longueur du premier côté du triangle.
     */
    public float getLongueurCote1() {
        return longueur_cote1;
    }

    /**
     * Setter pour la longueur du premier côté du triangle.
     * 
     * @param longueur_cote1 La nouvelle longueur du premier côté du triangle.
     */
    public void setLongueurCote1(float longueur_cote1) {
        this.longueur_cote1 = longueur_cote1;
    }

    /**
     * Getter pour la longueur du deuxième côté du triangle.
     * 
     * @return La longueur du deuxième côté du triangle.
     */
    public float getLongueurCote2() {
        return longueur_cote2;
    }

    /**
     * Setter pour la longueur du deuxième côté du triangle.
     * 
     * @param longueur_cote2 La nouvelle longueur du deuxième côté du triangle.
     */
    public void setLongueurCote2(float longueur_cote2) {
        this.longueur_cote2 = longueur_cote2;
    }

    /**
     * Getter pour la longueur du troisième côté du triangle.
     * 
     * @return La longueur du troisième côté du triangle.
     */
    public float getLongueurCote3() {
        return longueur_cote3;
    }

    /**
     * Setter pour la longueur du troisième côté du triangle.
     * 
     * @param longueur_cote3 La nouvelle longueur du troisième côté du triangle.
     */
    public void setLongueurCote3(float longueur_cote3) {
        this.longueur_cote3 = longueur_cote3;
    }
}
