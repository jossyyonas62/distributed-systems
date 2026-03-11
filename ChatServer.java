import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    static Vector<ClientHandler> clients = new Vector<>();

    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(1080);
            System.out.println("Chat Server started...");

            while (true) {

                Socket socket = server.accept();
                System.out.println("New client connected");

                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

                ClientHandler client = new ClientHandler(socket, dis, dos);
                clients.add(client);

                client.start();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ClientHandler extends Thread {

    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;

    public ClientHandler(Socket socket, DataInputStream dis, DataOutputStream dos) {
        this.socket = socket;
        this.dis = dis;
        this.dos = dos;
    }

    public void run() {

        String received;

        try {

            while (true) {

                received = dis.readUTF();

                if (received.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected");
                    break;
                }

                System.out.println("Message: " + received);

                // broadcast message to all clients
                for (ClientHandler client : ChatServer.clients) {
                    if (client != this) {
                        client.dos.writeUTF(received);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Connection closed");
        }

        try {
            socket.close();
        } catch (Exception e) {}
    }
}