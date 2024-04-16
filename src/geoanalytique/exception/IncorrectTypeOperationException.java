package geoanalytique.exception;

/**
 * Cette classe etend la Classe Exception.
 * Une exception est levée lorsqu'une opération est tentée avec un type
 * incorrect.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Katy Aidara
 * @author Mohamed Cissokho
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class IncorrectTypeOperationException extends Exception {

    public IncorrectTypeOperationException() {
        super("Opération tentée avec un type incorrect.");
    }

    /**
     * Cette methode obtient un message d'erreur détaillé comprenant les
     * informations de la cause.
     *
     * @return Le message d'erreur détaillé
     */
    @Override
    public String getMessage() {
        String message = super.getMessage();
        if (getCause() != null) {
            message += "\nCause: " + getCause();
        }
        return message;
    }

    /**
     * Cette methode obtient une représentation en chaîne de caractères de cette
     * exception.
     *
     * @return La représentation en chaîne de caractères de l'exception
     */
    @Override
    public String toString() {
        return "IncorrectTypeOperationException: " + getMessage();
    }
}

