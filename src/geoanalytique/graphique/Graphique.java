package geoanalytique.graphique;

import java.awt.Graphics;

/**
 * Classe abstraite représentant un objet graphique générique.
 * Cette classe définit une méthode abstraite "dessiner" qui doit être
 * implémentée
 * par les sous-classes spécifiques pour dessiner des éléments graphiques.
 */
abstract class Graphique {
    /**
     * Méthode abstraite pour dessiner l'objet graphique en utilisant l'objet
     * Graphics fourni.
     *
     * @param g Objet Graphics pour dessiner
     */
    abstract void dessiner(Graphics g);
}
