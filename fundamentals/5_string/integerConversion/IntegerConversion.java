import java.util.Scanner;

public class IntegerConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter an integer");

			
			int userInteger = Integer.parseInt(input.nextLine());

			System.out.println("Your integer is: "+ userInteger);


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}