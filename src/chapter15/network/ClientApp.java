package chapter15.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientApp {

    public static void main(String[] args) {
        ClientApp app = new ClientApp();

        app.run();
    }

    private void run()
    {
        try {
            while (true) {
                Socket s = new Socket("127.0.0.1", 9000);
                InputStreamReader stream = new InputStreamReader(s.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(stream);
                String line;
                line = bufferedReader.readLine();
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Oops! Reason:" + e.getMessage());
        }


    }
}
