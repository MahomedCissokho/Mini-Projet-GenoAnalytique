package geoanalytique.exception;

/**
 * Cette classe represente une sous classe d'exception qui est levée lorsqu'une
 * opération est effectuée avec un argument
 * invalide.
 * 
 * @author Abdallah Solofo Victor Aicha
 * @author Nana Katy Aidara
 * @author Mohamed Cissokho
 * @author Fatimata Tidiane Dia
 * @author Bassirou Kane
 */
public class ArgumentOperationException extends Exception {

    public ArgumentOperationException() {
        super("Opération effectuée avec un argument invalide.");
    }

    /**
     * Obtient un message d'erreur détaillé comprenant les informations de la cause.
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
     * Obtient une représentation en chaîne de caractères de cette exception.
     *
     * @return La représentation en chaîne de caractères de l'exception
     */
    @Override
    public String toString() {
        return "ArgumentOperationException: " + getMessage();
    }
}

