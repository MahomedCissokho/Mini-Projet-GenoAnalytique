package geoanalytique.model;

import java.util.List;
/**
 * Représente une surface dans un plan cartésien.
 * Une surface est définie par une liste de points qui la délimitent.
 * Cette classe est abstraite et sert de classe de base pour d'autres surfaces spécifiques.
 * @author Abdallah Victor Assolofo Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */

public abstract class Surface extends GeoObject {
    protected List<Point> points;
}
