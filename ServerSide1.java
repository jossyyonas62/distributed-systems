import java.io.*;
import java.net.*;

public class ServerSide1 {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(1080);
            System.out.println("Server started... Waiting for clients");

            while (true) {

                Socket client = server.accept();
                System.out.println("Client connected: " + client.getInetAddress());

                ClientHandler handler = new ClientHandler(client);
                handler.start(); // new thread
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

class ClientHandler extends Thread {

    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {

        try {

            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

            while (true) {

                String message = dis.readUTF();
                System.out.println("Client says: " + message);

                dos.writeUTF("Server received: " + message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            socket.close();
            System.out.println("Client disconnected");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}