package chapter11;

public class AudiException extends Exception {

    @Override
    public String getMessage()
    {
        return "Audi " + super.getMessage();
    }

    public AudiException(String s) {
        super(s);
    }
}
