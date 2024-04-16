package geoanalytique.view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import geoanalytique.model.*;
import geoanalytique.model.GeoObject;
import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.util.Dessinateur;

/**
 * Cette classe est l'interface graphique representant la zone de dessin
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Katy Aidara
 * @author Mohamed Cissokho
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */

public class GeoAnalytiqueView extends JPanel {
    private List<GeoObject> graphiques;
    private static final int LARGEUR = 800;
    private static final int HAUTEUR = 600;
    Graphics g;
    GeoAnalytiqueControleur gc;

    public GeoAnalytiqueView(GeoAnalytiqueControleur gc) {
        this.graphiques = new ArrayList<>();
        this.gc = gc;
        setBackground(Color.WHITE);
    }

    public void ajouterFigure(GeoObject geoObject) {
        graphiques.add(gc.addObject(GeoObject objet));
        // utilisation de la fonction addObject de GeoAnalytiqueControleur
    }

    /**
     * Efface tous les objets géométriques de la vue.
     */
    public void effacerGeoObjects() {
        graphiques.clear();
        repaint();
    }

    private void dessinerRepere(Graphics g) {
        // Dessiner la droite des abscisses (Ox)
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);

        // Dessiner la droite des ordonnées (Oy)
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dessinerRepere(g);
        dessinerObjects(g);
    }

    private void dessinerObjects(Graphics g) {
        for (GeoObject geoObject : graphiques) {
            if(geoObject instanceof Carre)


        }
    }
}
