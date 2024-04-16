package geoanalytique.exception;

/**
 * Classe d'exception spécifique aux visiteurs dans l'application GeoAnalytique.
 * Cette exception peut être levée pour signaler des erreurs ou des situations
 * exceptionnelles
 * lors de l'utilisation des visiteurs (par exemple, lors de la visite d'un
 * modèle).
 */
public class VisiteurException extends RuntimeException {

    /**
     * Constructeur avec un message d'erreur.
     *
     * @param message Message d'erreur décrivant la situation exceptionnelle.
     */
    public VisiteurException(String message) {
        super(message);
    }

    /**
     * Constructeur avec un message d'erreur et une exception d'origine.
     *
     * @param message Message d'erreur décrivant la situation exceptionnelle.
     * @param cause   Exception d'origine (peut être null).
     */
    public VisiteurException(String message, Throwable cause) {
        super(message, cause);
    }
}
