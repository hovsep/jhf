
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            throw new Exception("Too few params");
        }

        int a  = Integer.parseInt(args[0]);
        int b  = Integer.parseInt(args[1]);

        if (a == 0) {
            System.out.println(b);
        }

        if (b == 0) {
            System.out.println(a);
        }

        if (a >= b) {

        }


    }

}
