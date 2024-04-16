package geoanalytique.model;
/**
 * Représente une ellipse dans un plan cartésien.
 * Une ellipse est définie par ses demi-axes et son centre.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class Ellipse extends Surface {
    private float demi_petit_axe;
    private float demi_grand_axe;
    protected Point centre;

    /**
     * Constructeur avec paramètres de la classe Ellipse.
     * Initialise les demi-axes et le centre de l'ellipse avec les valeurs spécifiées.
     * @param demi_petit_axe La longueur du demi-petit axe de l'ellipse.
     * @param demi_grand_axe La longueur du demi-grand axe de l'ellipse.
     * @param centre Le centre de l'ellipse.
     */
    public Ellipse(float demi_petit_axe, float demi_grand_axe, Point centre) {
        this.demi_petit_axe = demi_petit_axe;
        this.demi_grand_axe = demi_grand_axe;
        this.centre = centre;
    }

    /**
     * Getter pour la longueur du demi-petit axe de l'ellipse.
     * @return La longueur du demi-petit axe de l'ellipse.
     */
    public float getDemiPetitAxe() {
        return demi_petit_axe;
    }

    /**
     * Setter pour la longueur du demi-petit axe de l'ellipse.
     * @param demi_petit_axe La nouvelle longueur du demi-petit axe de l'ellipse.
     */
    public void setDemiPetitAxe(float demi_petit_axe) {
        this.demi_petit_axe = demi_petit_axe;
    }

    /**
     * Getter pour la longueur du demi-grand axe de l'ellipse.
     * @return La longueur du demi-grand axe de l'ellipse.
     */
    public float getDemiGrandAxe() {
        return demi_grand_axe;
    }

    /**
     * Setter pour la longueur du demi-grand axe de l'ellipse.
     * @param demi_grand_axe La nouvelle longueur du demi-grand axe de l'ellipse.
     */
    public void setDemiGrandAxe(float demi_grand_axe) {
        this.demi_grand_axe = demi_grand_axe;
    }

     /**
     * Getter pour le centre de l'ellipse.
     * @return Le centre de l'ellipse.
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * Setter pour le centre de l'ellipse.
     * @param centre Le nouveau centre de l'ellipse.
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }
}
