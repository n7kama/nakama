import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args) throws IOException {
        //start method
        start(5999);
    }

    //socket method 
    public static void start(int port) {
        try {

            // creates a new socket
            ServerSocket serverSocket = new ServerSocket(port);

            // I made this so that the server will listen for a minute for clients to join, it will print that its waiting for players(clients) to join
            serverSocket.setSoTimeout(60000);
            System.out.println("Waiting for players");

            //continue the thread if serversocket is not closed
            while (!serverSocket.isClosed()) {

                // waits for two clients to be accepted into the server
                Socket client1 = serverSocket.accept();
                Socket client2 = serverSocket.accept();

                //turns bytes into characters
                InputStreamReader reader1 = new InputStreamReader(client1.getInputStream());
                InputStreamReader reader2 = new InputStreamReader(client2.getInputStream());

				// reads text from a character input stream
                BufferedReader input1 = new BufferedReader(reader1);
                BufferedReader input2 = new BufferedReader(reader2);

				// encodes characters into bytes
                OutputStreamWriter writer1 = new OutputStreamWriter(client1.getOutputStream());
                OutputStreamWriter writer2 = new OutputStreamWriter(client2.getOutputStream());

				// prints outputs
                PrintWriter output1 = new PrintWriter(writer1);
                PrintWriter output2 = new PrintWriter(writer2);

                // Reads the players inputs 
				String client1Choice;
				String client2Choice;
                client1Choice = input1.readLine();
                client2Choice = input2.readLine();
				
				// Win condition
                String result1 = null;
                String result2 = null;

                if (client1Choice.equalsIgnoreCase(client2Choice)) {
                    result1 = "It's a Tie!";
                    result2 = "It's a Tie!";
                } else if ((client1Choice.equalsIgnoreCase("rock")) && (client2Choice.equalsIgnoreCase("scissors"))) {
                    result1 = "VICTORY!!";
                    result2 = "DEFEAT!!";
                } else if ((client1Choice.equalsIgnoreCase("rock")) && (client2Choice.equalsIgnoreCase("paper"))) {
                    result1 = "DEFEAT!!";
                    result2 = "VICTORY!!";
                } else if ((client1Choice.equalsIgnoreCase("paper")) && (client2Choice.equalsIgnoreCase("rock"))) {
                    result1 = "VICTORY!!";
                    result2 = "DEFEAT!!";
                } else if ((client1Choice.equalsIgnoreCase("paper")) && (client2Choice.equalsIgnoreCase("scissors"))) {
                    result1 = "DEFEAT!!";
                    result2 = "VICTORY!!";
                } else if ((client1Choice.equalsIgnoreCase("scissors")) && (client2Choice.equalsIgnoreCase("paper"))) {
                    result1 = "VICTORY!!";
                    result2 = "DEFEAT!!";
                } else if ((client1Choice.equalsIgnoreCase("scissors")) && (client2Choice.equalsIgnoreCase("rock"))) {
                    result1 = "DEFEAT!!";
                    result2 = "VICTORY!!";
                }

                //formats and sends the results as an output to the players
                output1.write(result1, 0, result1.length());
                output2.write(result2, 0, result2.length());
                output1.flush();
                output2.flush();
                System.out.println("Player 1: " + result1);
                System.out.println("Player 2: " + result2);

                //Closes the sockets
                client1.close();
                client2.close();
			}
			
        } catch (IOException e) {
            System.out.println("Connection failed, cancelling.");
        }

    }
}

