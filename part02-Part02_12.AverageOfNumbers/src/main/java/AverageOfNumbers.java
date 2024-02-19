
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumOfNumber = 0;
        double numOfNumber = 0;

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

        System.out.println("Average of the numbers: " + sumOfNumber/numOfNumber);
     

    }
}
