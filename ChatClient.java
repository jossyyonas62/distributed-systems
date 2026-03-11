import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 1080);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);

            // thread to read messages from server
            Thread readThread = new Thread(() -> {
                try {
                    while (true) {
                        String msg = dis.readUTF();
                        System.out.println("Message received: " + msg);
                    }
                } catch (Exception e) {
                }
            });

            readThread.start();

            while (true) {

                String message = sc.nextLine();
                dos.writeUTF(message);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}