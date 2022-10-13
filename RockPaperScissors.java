/**
 * Lab:2 Problem 7: Rock Paper Scissors
 * 
 * @author Charlie Le
 * @version September 7, 2019
 */

 import java.util.Scanner;

 public class RockPaperScissors {
     public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
         
        int cases = input.nextInt();

        for (int i = 0; i < cases;i++){

            String player1 = input.next();
            String player2 = input.next();

            if (player1.equals("rock")){
                if (player2.equals("rock")){
                    System.out.println("Tie!");
                }
                else if (player2 .equals("scissors")){
                    System.out.println("Player 1 wins!");
                }
                else if (player2 .equals("paper")){
                    System.out.println("Player 2 wins!");
                }
            }//end if rock

            if (player1.equals("scissors")){
                if (player2.equals("scissors")){
                    System.out.println("Tie!");
                }
                else if (player2.equals("paper")){
                    System.out.println("Player 1 wins!");
                }
                else if (player2.equals("rock")){
                    System.out.println("Player 2 wins!");
                }
            }

            if (player1.equals("paper")){
                if (player2.equals("paper")){
                    System.out.println("Tie!");
                }
                else if (player2.equals("rock")){
                    System.out.println("Player 1 wins!");
                }
                else if (player2.equals("scissors")){
                    System.out.println("Player 2 wins!");
                }
            }
        }
    }
}        

    



 