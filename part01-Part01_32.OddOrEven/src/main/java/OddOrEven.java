
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = scan.nextInt();
        //int oddOrEvan = number%2;


        if(number % 2 == 0){
            System.out.println("The number " + number + " is even");
        }else{
            System.out.println("The number " + number + " is odd");
        }
    }

}
