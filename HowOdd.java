/**
 * Lab1: Problem 7: How Odd!
 * 
 * @author Charlie Le
 * @version September 2, 2019
 */
import java.util.Scanner;

public class HowOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int n = input.nextInt();

        boolean evenNum = n%2 == 0;

        if (evenNum){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }


    }
}