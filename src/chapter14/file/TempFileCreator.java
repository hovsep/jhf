package chapter14.file;

import java.io.File;
import java.io.IOException;

public class TempFileCreator {

    public static void main(String[] args) {

        File dir = new File("testdir");
        dir.mkdir();

        try {
            File file;
            file = File.createTempFile("aaa","b",dir);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
