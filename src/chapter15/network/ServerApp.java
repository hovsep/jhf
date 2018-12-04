package chapter15.network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

    public static void main(String[] args) {

        ServerApp server = new ServerApp();
        server.start();
    }

    private void start()
    {
        try {
            ServerSocket serverSocket = new ServerSocket(9000);

            while (true) {
                Socket s = serverSocket.accept();

                PrintWriter writer = new PrintWriter(s.getOutputStream());
                writer.println("Hey yo! " + Math.random());
                writer.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
