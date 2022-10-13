import java.util.Scanner;

public class StudentGrader {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double testAvg = input.nextDouble();
        double hwAvg = input.nextDouble();
        double labAvg = input.nextDouble();

        double finalAvg = (testAvg * .4) + (hwAvg * .5)+(labAvg * .1);

        System.out.printf("%.1f%n", finalAvg);
    }
}