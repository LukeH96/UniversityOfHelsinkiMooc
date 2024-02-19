
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here

        int smallest = list.get(0);

        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }

        int greatest = list.get(0);

        for(int i =0; i < list.size(); i++){
            int number1 = list.get(i);
            if (greatest < number1){
                greatest = number1;
            }
        }

        System.out.println("The smallest number: " + smallest);
        System.out.println("The greatest number: "+ greatest);

        
    }
}
