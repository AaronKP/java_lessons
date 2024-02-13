import java.util.Scanner;

public class BooleanConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a boolean value ");

			
			boolean userBoolean = Boolean.parseBoolean(input.nextLine());

			System.out.println("Your boolean value is: "+ userBoolean);


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}