package geoanalytique.model;

/**
 * Représente un segment dans un plan cartésien.
 * Un segment est défini par ses deux extrémités.
 * Il hérite de la classe Droite.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Katy Aidara
 * @author Mohamed Cissokho
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Segment extends Droite {
    protected Point debut;
    protected Point fin;

    /**
     * Constructeur avec paramètres de la classe Segment.
     * Initialise les points de début et de fin du segment.
     * @param debut Le point de début du segment.
     * @param fin Le point de fin du segment.
     */
    public Segment(float ordonneeOrigine, float coefficientDirecteur, Point debut, Point fin) {
        super(ordonneeOrigine, coefficientDirecteur);
        this.debut = debut;
        this.fin = fin;
    }
    

    /**
     * Getter pour le point de début du segment.
     * @return Le point de début du segment.
     */
    public Point getDebut() {
        return debut;
    }

    /**
     * Setter pour le point de début du segment.
     * @param debut Le nouveau point de début du segment.
     */
    public void setDebut(Point debut) {
        this.debut = debut;
    }

    /**
     * Getter pour le point de fin du segment.
     * @return Le point de fin du segment.
     */
    public Point getFin() {
        return fin;
    }

    /**
     * Setter pour le point de fin du segment.
     * @param fin Le nouveau point de fin du segment.
     */
    public void setFin(Point fin) {
        this.fin = fin;
    }
}
