
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Where to?");
        int finish = Integer.valueOf(scanner.nextInt());
        System.out.println("Where from");
        int start = Integer.valueOf(scanner.nextInt());

        for(int i = start; i <=finish; i++){
            if(finish >= start){
                System.out.println(i);
            }
        }

        //int count = 1;

        // while(count <=input){
        //     System.out.println(count);
        //     count++;
        // }

       

        // System.out.println("where from");
        // int input2 = Integer.valueOf(scanner.nextInt());

        // while(count <=input){
        //     System.out.println(count);
        //     count++;
        // }



    }
}
