package chapter11.exceptions;

public class PlayWithExceptions {

    private void riskyMethod() throws AudiException, BmwException,MercedesException
    {
        //Throw random exception

        int fate = (int) (Math.random() * 10);
        String msg = "Fate is " + fate;

        if (fate >= 7) {
            throw new AudiException(msg);
        }

        if (fate >= 4) {
            throw new BmwException(msg);
        }

        if (fate >= 0) {
            throw new MercedesException(msg);
        }
    }



    public static void main(String[] args) throws Exception
    {
        (new PlayWithExceptions()).riskyMethod();
        System.out.println("Hello!");
    }
}
