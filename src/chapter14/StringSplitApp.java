package chapter14;

public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Hovsep;Vita;HovsepJr;VitaJr";
        String[] tokens = s.split(";");

        for (String token : tokens) {
            System.out.println(token);
        }

    }
}
