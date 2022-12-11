import java.net.*;
import java.io.*;
import java.util.*;

public class Client {

    
    //main method
    public static void main(String[] args) throws IOException {

        try {
            // opens a socket towards a server through port and address
            InetAddress address = InetAddress.getByName("localhost");
            Socket client = new Socket("localhost", 5999);
            System.out.println("Player ready.\n");

            // allows access to clients outputs
            InputStreamReader reader = new InputStreamReader(client.getInputStream());
            BufferedReader inbox = new BufferedReader(reader);
            OutputStreamWriter writer = new OutputStreamWriter(client.getOutputStream());
            BufferedWriter outbox = new BufferedWriter(writer);

            // asks for player input, then the choice is printed
            String playerInput = userInput();
            System.out.println("Player Chooses : " + playerInput);
            outbox.write(playerInput + "\n", 0, playerInput.length() + 1);
            outbox.flush();

            // prints the results for each client
            String playerResult = inbox.readLine();
            System.out.println(playerResult);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //stores client input as a string
    private static String userInput() {
        //scanner
        Scanner messageScan = new Scanner(System.in);
        String playerInput = null;

        //while loop that prompts the client to choose a rock, paper or scissors
        while (!("rock".equalsIgnoreCase(playerInput)) && !("scissors".equalsIgnoreCase(playerInput)) && !("paper".equalsIgnoreCase(playerInput))){
            System.out.print("Enter Rock, Paper, or Scissors: ");
            playerInput = messageScan.next();
        }
        return playerInput;
    }
}