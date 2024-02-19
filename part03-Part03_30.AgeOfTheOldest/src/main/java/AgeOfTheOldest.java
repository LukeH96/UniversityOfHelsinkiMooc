
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, oldest = 0;

        while (true) {

            String userName = scanner.nextLine();
            if (userName.equals("")) {
                System.out.println();
                break;
            }

            String[] pieces = userName.split(",");
            age = Integer.valueOf(pieces[1]);

            if (age > oldest) {
                oldest = age;

            }
        
        }
        System.out.println("Age of the oldest: " + oldest);

    }        
}
