
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumOfNumber = 0;
        double numOfNumber = 0;

        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
         
            if(number == 0){
                System.out.println("Cannot calculate the average");
                break;
            }else if(number > 0){
                sumOfNumber = sumOfNumber + number;
                numOfNumber++;
            }

        }

        System.out.println(sumOfNumber/numOfNumber);

    }
}
