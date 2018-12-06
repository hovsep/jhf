
public class Sandbox {


    public static void main(String[] args) {
        int i = 0;
    }

    public void go()
    {
        int i = 0;

        synchronized (this) {
            i++;
        }
    }

}
