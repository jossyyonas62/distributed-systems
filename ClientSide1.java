import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientSide1 {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 1080);
            System.out.println("Connected to server");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);

            while (true) {

                System.out.print("Enter message: ");
                String message = scanner.nextLine();

                dos.writeUTF(message);

                String response = dis.readUTF();
                System.out.println(response);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            socket.close();
            scanner.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}