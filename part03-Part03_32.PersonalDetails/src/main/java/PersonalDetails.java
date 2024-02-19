
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int sum = 0;
        int count = 0;
        int namelength, temp = 0;
        while (true) {
            String userName = scanner.nextLine();
            if (userName.equals("")) {
                System.out.println();
                break;
            }

            String[] parts = userName.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;

            namelength = parts[0].length();

            if(temp < namelength){
                temp = namelength;
                name = parts[0];
            }

        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
