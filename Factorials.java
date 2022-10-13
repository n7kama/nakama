/**
 * Lab 3: Problem 8: Facotrials
 * 
 * @author Charlie Le
 * @version September 17, 2019
 */

import java.util.Scanner;


public class Factorials{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int cases = input.nextInt();

        


        for (int i = 0; i < cases; i++) {

            long factorial= input.nextInt();

            long a = 1;


            
                
            for(long f = 1; f <= factorial; f++){

                a = a * f;

            }
            System.out.println(a);

                

            
            


        }
       

        
    }
}

