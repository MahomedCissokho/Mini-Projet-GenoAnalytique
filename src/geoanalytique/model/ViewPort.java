package geoanalytique.model;

/**
 * C'est au niveau de cette classe que les conversions des coordonnees
 * reelles en coordonnees entieres et vice versa sont faite pour la
 * representation a l'ecran
 * Les attributs de cette classe sont :
 * - largeurZone : la largeur de la zone affichée.
 * - hauteurZone : la hauteur de la zone affichée.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Katy Aidara
 * @author Mohamed Cissokho
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class ViewPort {

    private static final int largeurZone = 800;
    private static final int hauteurZone = 600;

    /**
     * Cette méthode effectue la conversion de coordonnées réelles en coordonnées
     * entières pour l'affichage à l'écran.
     * 
     * @param x Coordonnée réelle sur l'axe des abscisses.
     * @param y Coordonnée réelle sur l'axe des ordonnées.
     * @return Un objet Point représentant les coordonnées converties en entiers.
     */
    public Point conversionEntiere(float x, float y) {
        // On prend 1 unite ---> 5 pixels sur l'ecran pour l'axe des abcisses et
        // ordonnees
        int echelleX = 5;
        int echelleY = 5;
        int newX = (int) x * echelleX;
        int newY = (int) y * echelleY;
        return new Point(newX, newY);
    }

    /**
     * Cette méthode effectue la conversion de coordonnées entières en coordonnées
     * réelles.
     * 
     * @param x Coordonnée entière sur l'axe des abscisses.
     * @param y Coordonnée entière sur l'axe des ordonnées.
     * @return Un objet Point représentant les coordonnées converties en réelles.
     */
    public Point conversionReel(int x, int y) {
        // On prend 1 unite ---> 5 pixels sur l'ecran pour l'axe des abcisses et
        // ordonnees
        int echelleX = 5;
        int echelleY = 5;
        float newX = (float) (x / echelleX);
        float newY = (float) (y / echelleY);
        return new Point(newX, newY);
    }
}

