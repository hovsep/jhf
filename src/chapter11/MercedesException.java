package chapter11;

public class MercedesException extends Exception {

    @Override
    public String getMessage()
    {
        return "Mercedes " + super.getMessage();
    }


    public MercedesException(String s) {
        super(s);
    }
}
