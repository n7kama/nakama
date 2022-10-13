/**
 * Lab 3: Problem 1: Prime Number
 * 
 * @author Charlie Le
 * @version September 10, 2019
 */
import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] args){
        //Build a Scanner
        Scanner input = new Scanner(System.in);
        //Declare & Initialize a testcases variable
        int cases = input.nextInt();

        //For each case
        for (int i = 0; i < cases; i++) {


            //Take in the number typwed using nextint() & store in a variable
            int number = input.nextInt();
            //Clear the Scanner's buffer.
            input.nextLine();
            //Declare boolean isPrime and set it to true
            boolean isPrime = true;
            // For each factor of the number in question, starting with the number 2 (as a factor)
            // and ending with whatever factor time itself is greater than the number in question,
            //and incrementing the factor by one each time through the for-loop,
            for(int factor = 2; factor * factor <= number; factor++) {
                

                if (number % factor == 0) {
                    isPrime = false;
                    break;
                }

                    //Set isPrime to false
                    //BREAK out the for-loop

                    //Print out whether the number in question is prime, by printing out "isPrime"
            }
            System.out.println(isPrime) ;
        }
    }
}