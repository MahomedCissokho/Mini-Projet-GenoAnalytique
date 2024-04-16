package geoanalytique.model;
import java.util.List;
/**
 * Représente un polygone dans un plan cartésien.
 * Un polygone est défini par un nombre de côtés et une liste de sommets.
 * Cette classe est abstraite et sert de classe de base pour d'autres polygones spécifiques.
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Cathy Aidara
 * @author Mohamed Cissoko
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public abstract class Polygone extends Surface {
    protected int nombre_cote;
    protected List<Point> sommets;
}
