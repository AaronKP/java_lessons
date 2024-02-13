import java.util.Scanner;

public class DoubleConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a double ");

			
			double userDouble = Double.parseDouble(input.nextLine());

			System.out.println("Your double is: "+ userDouble);


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}