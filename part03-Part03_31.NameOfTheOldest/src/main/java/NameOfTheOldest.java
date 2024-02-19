
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, oldest = 0;
        String name = "";

        while (true) {
            String userName = scanner.nextLine();
            if (userName.equals("")) {
                System.out.println();
                break;
            }

            String[] parts = userName.split(",");
            age = Integer.valueOf(parts[1]);

            if (age > oldest) {
                oldest = age;
                name = parts[0];
            }

        }

        System.out.println("Name of the oldest: " + name);

    }
}
