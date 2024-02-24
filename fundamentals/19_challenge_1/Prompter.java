import java.util.Scanner;

public class Prompter { 
   public static String prompt(String prompt){      
       Scanner kb =  new Scanner(System.in);
       System.out.println(prompt);
       return kb.nextLine();
   }
}