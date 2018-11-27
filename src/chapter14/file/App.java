package chapter14.file;

import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("data.txt");

            for (int i = 1; i<100; i++) {
                fileWriter.append("Line " + i + "\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
