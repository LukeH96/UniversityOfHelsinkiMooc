
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sum1 = first + second;
        int sum2 = first - second;
        int sum3 = first * second;
        double sum4 = 1.0 * first / second ;

        System.out.println(first + " + " + second +" = "+ sum1);
        System.out.println(first + " - " + second +" = "+ sum2);
        System.out.println(first + " * " + second +" = "+ sum3);
        System.out.println(first + " / " + second +" = "+ sum4);

    }
}
