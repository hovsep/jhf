package chapter14.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderApp {

    public static void main(String[] args) {
        try {
            File file = new File("/home/hovsep/app/PhpStorm-182.4892.16/bin/phpstorm.sh");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while (null != (line = reader.readLine())) {
                System.out.println(line);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
