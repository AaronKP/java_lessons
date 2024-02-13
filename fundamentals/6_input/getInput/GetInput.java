import java.util.Scanner;

public class GetInput{ 
     public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");        
        String name = in.nextLine();
        System.out.println("Enter surname:"); 
        String surname = in.nextLine();
        System.out.println("Hello: " + name+ " "+ surname);
    }
}
