package chapter16.sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class SortingApp {

    public static void main(String[] args) {
        SortingApp app = new SortingApp();
        app.launch();
    }

    private void launch()
    {
        ArrayList<String> songs = this.getSongs();

        //This  does same thing: Collections.sort(songs);
        songs.sort(null);
        for (String song: songs) {
            System.out.println(song);
        }

    }


    private ArrayList<String> getSongs()
    {
        ArrayList<String> songs = new ArrayList<String>();

        try {

            final String filename = "/home/hovsep/tmp/data.txt";
            File file = new File(filename);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;

            while (null != (line = bufferedReader.readLine())) {
                songs.add(line);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return songs;

    }
}
