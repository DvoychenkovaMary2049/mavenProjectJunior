package annotation;

public class NotValidException extends RuntimeException{
    public NotValidException(String message) {
        super(message);
    }
}
