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
        ArrayList<Song> songs = this.getSongs();

        //This  does same thing: Collections.sort(songs);
        songs.sort(null);

        System.out.println(songs);

    }


    private ArrayList<Song> getSongs()
    {
        ArrayList<Song> songs = new ArrayList<Song>();

        try {

            final String filename = "/home/hovsep/tmp/data.txt";
            File file = new File(filename);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while (null != (line = bufferedReader.readLine())) {
                songs.add(new Song(line, "Deftones", 1991));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return songs;

    }

    private <T extends Object> void generifiedMethod(ArrayList<T> list) {

    }


    class Song implements Comparable<Song> {
        private String title = null;

        private String author = null;

        private int year = 0;

        public Song(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public int compareTo(Song s) {
            return this.title.compareTo(s.title);
        }

        @Override
        public String toString() {
            return this.title;
        }
    }
}
