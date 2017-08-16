import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {
        // Here we define the port : 12345
        Socket socket = new Socket("localhost", 1978);
        System.out.println("Connected");
        // The text msg
        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println("Test Socket");
        // To use the keyboard
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();// wait enter to continue
        // To close every thing.
        printStream.close(); // close output
        keyboard.close(); // close keyboard
        socket.close(); // Close the conection
    }
}