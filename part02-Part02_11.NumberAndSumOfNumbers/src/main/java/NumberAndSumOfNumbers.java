
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumber = 0;
        int numOfNumber = 0;

        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
         
            if(number == 0){
                break;
            }else if(number != 0){
                sumOfNumber = sumOfNumber + number;
                numOfNumber++;

            }
        }

        System.out.println("Number of numbers: " + numOfNumber);
        System.out.println("Sum of the numbers: " + sumOfNumber);

    }
}
