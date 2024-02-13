import java.util.Scanner;

public class FloatConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a float ");

			
			float userFloat = Float.parseFloat(input.nextLine());

			System.out.println("Your float is: "+ userFloat);


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}