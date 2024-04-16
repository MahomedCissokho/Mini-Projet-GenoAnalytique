package geoanalytique.util;

/**
 * 
 */
public interface Operation {

    public abstract String getTitle();

    public abstract int getArite();

    public abstract void setArgument(int num, Object o);

    public abstract Class getClassArgument(int num);

    public abstract Object calculer();
    public abstract String getDescriptionArgument(int num);
}
