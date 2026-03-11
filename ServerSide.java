import java.io.*;
//import java.net.*;
import java.net.Socket;
import java.net.ServerSocket;

public class ServerSide {

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(1080);
            System.out.println("Server started... Waiting for client");

            Socket client = server.accept();
            System.out.println("Client connected");

            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());

            String message = dis.readUTF();
            System.out.println("Client says: " + message);

            dos.writeUTF("Hello Client");

            dis.close();
            dos.close();
            client.close();
            server.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}