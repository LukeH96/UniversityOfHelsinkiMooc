
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = String.valueOf(scan.nextLine());
        System.out.println("Give an Integer:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Give an Double:");
        Double decemil = Double.valueOf(scan.nextLine());
        System.out.println("Give an Boolean:");
        Boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string: "+ text);
        System.out.println("You gave the integer "+ number);
        System.out.println("You gave the double: " + decemil);
        System.out.println("You gave the Boolean: " + trueOrFalse );
        

    }
}
