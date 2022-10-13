/**
 * Lab 1: Problem 4: Bouncer Bot
 * 
 * @author Charlie Le 
 * @version September 2, 2019
 */

import java.util.Scanner;

public class BouncerBot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int curMonth = input.nextInt();
        int curDay = input.nextInt();
        int curYear = input.nextInt();

        int birMonth = input.nextInt();
        int birDay = input.nextInt();
        int birYear = input.nextInt();

        boolean twentyOne = curYear - birYear >= 21;
        boolean sameMonth = curMonth - birMonth == 0;
        boolean sameDay = curDay - birDay == 0;
        
        if (sameMonth)
            if (sameDay)
                if (twentyOne){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            
            else{
                System.out.println("false");
            }
        
        else{
            System.out.println("false");
        }
    }
}
