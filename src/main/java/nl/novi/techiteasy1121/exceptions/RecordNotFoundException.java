package nl.novi.techiteasy1121.exceptions;

// Deze klasse vormt onze custom exception
public class RecordNotFoundException extends RuntimeException {

    // De exception zonder message
    public RecordNotFoundException() {

        super();

    }

    // De exception met message
    public RecordNotFoundException(String message) {

        super(message);

    }

}
