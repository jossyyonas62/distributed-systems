import java.io.*;
//import java.net.*;
import java.net.Socket;

public class ClientSide {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 1080);
            System.out.println("Connected to server");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Hello Server");

            String message = dis.readUTF();
            System.out.println("Server says: " + message);

            dis.close();
            dos.close();
            socket.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}