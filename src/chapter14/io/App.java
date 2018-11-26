package chapter14.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }


    private void run()
    {
        Hova h = new Hova(27, "Ёхри-мохри");
        Vita v = new Vita(23, "Кутусьма");

        try {
            FileOutputStream fstream = new FileOutputStream("/home/hovsep/tmp/jhf.data");
            ObjectOutputStream ostream = new ObjectOutputStream(fstream);

            ostream.writeObject(h);
            ostream.writeObject(v);
            ostream.close();
        } catch (Exception e) {
            System.out.println("Ooops. Reason: " + e.getMessage());
        }


    }


    class Hova implements Serializable {

        transient private int age = 27;

        private String name = "Hovsep";

        public Hova(int age, String name) {
            this.age = age;
            this.name = name;
        }

        private String makeAWish()
        {
            return "Cool job";
        }
    }

    class Vita implements Serializable {

        private int age = 23;

        private String name = "Vita";

        public Vita(int age, String name) {
            this.age = age;
            this.name = name;
        }

        private String makeAWish()
        {
            return "Happy life";
        }
    }
}
