package geoanalytique.model;

import java.util.List;

public abstract class Polygone extends Surface {
    protected int nombre_cote;
    protected List<Point> sommets;
}
