
import java.util.Scanner;

public class AbsoluteValue {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer1 = Integer.valueOf(scanner.nextLine());
        
        if(integer1<0){
            System.out.println(integer1*-1);
        }else{
            System.out.println(integer1);
        }

    }
}
