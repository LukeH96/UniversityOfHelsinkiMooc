
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());

        int count = 0;

        while(count <= input){
            System.out.println(count);
            count++;
        }

        // System.out.println("for loop");

        // for(int i =0; i <= input; i++){
        //     System.out.println(i);
       // }

    }
}
