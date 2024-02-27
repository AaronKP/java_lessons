import java.util.Scanner;

public class Prompter { 
   //params (prompt: String)
   //return String user input
   //method that prompts a user for input.
   public static String prompt(String prompt){      
       Scanner kb =  new Scanner(System.in);
       System.out.println(prompt);
       return kb.nextLine();
   }
}