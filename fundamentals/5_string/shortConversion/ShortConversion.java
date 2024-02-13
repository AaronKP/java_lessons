import java.util.Scanner;

public class ShortConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a short ");

			
			float userShort = Short.parseShort(input.nextLine());

			System.out.println("Your short is: "+ userShort);


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}