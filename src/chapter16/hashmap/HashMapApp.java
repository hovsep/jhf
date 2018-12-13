package chapter16.hashmap;

import java.util.HashMap;

public class HashMapApp {

    public static void main(String[] args) {
        HashMapApp app = new HashMapApp();

        app.launch();
    }

    private void launch()
    {
        HashMap map = new HashMap<Integer, String>();

        for (int i = 0; i <= 5; i++) {
            map.put(i,"item " + i);
        }

        map.replace(3, "replaced");


        System.out.println(map.toString());

    }
}
