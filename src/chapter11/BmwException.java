package chapter11;

public class BmwException extends Exception {

    @Override
    public String getMessage() {
        return "BMW " + super.getMessage();
    }

    public BmwException(String s) {
        super(s);
    }
}
