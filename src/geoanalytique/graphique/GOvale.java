package geoanalytique.graphique;

import java.awt.Graphics;

/**
 * Classe abstraite représentant un objet graphique ovale.
 * Cette classe étend la classe abstraite Graphique et fournit une
 * implémentation
 * de la méthode dessiner pour dessiner un ovale.
 */
public abstract class GOvale extends Graphique {
    private int x; // Coordonnée x du coin supérieur gauche de l'ovale
    private int y; // Coordonnée y du coin supérieur gauche de l'ovale
    private int largeur; // Largeur de l'ovale
    private int hauteur; // Hauteur de l'ovale

    /**
     * Constructeur pour initialiser les coordonnées, la largeur et la hauteur de
     * l'ovale.
     *
     * @param x       Coordonnée x du coin supérieur gauche de l'ovale
     * @param y       Coordonnée y du coin supérieur gauche de l'ovale
     * @param largeur Largeur de l'ovale
     * @param hauteur Hauteur de l'ovale
     */
    public GOvale(int x, int y, int largeur, int hauteur) {
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    /**
     * Méthode pour dessiner l'ovale en utilisant l'objet Graphics fourni.
     *
     * @param g Objet Graphics pour dessiner
     */
    @Override
    public void dessiner(Graphics g) {
        g.drawOval(x, y, largeur, hauteur);
    }
}
