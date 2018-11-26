package chapter14.serialization;

import java.io.*;

public class SerializationTest {

    static final String FILENAME = "data.txt";

    public static void main(String[] args) {
        SerializationTest app = new SerializationTest();

        app.write();
        app.read();
    }


    public void write()
    {
        Human h1 = new Human(27, "Hovsep", "Ёхри");
        Human h2 = new Human(23, "Vita", "Витуська");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(h1);
            objectOutputStream.writeObject(h2);
            objectOutputStream.close();
            System.out.println("All humans are serialized");
        } catch (IOException e) {
            System.out.println("Oops! Failed to write Reason: " + e.getMessage());

        }

    }


    public void read()
    {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILENAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Human h;

            while (null != (h = (Human) objectInputStream.readObject())) {
                System.out.println(h);
            }

        } catch (Exception e) {
            System.out.println("Oops! Failed to read Reason: " + e.getMessage());
        }

    }

}
