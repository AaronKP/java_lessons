import java.util.Scanner;

public class LongConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a Long integer ");

			
			long userLong = Long.parseLong(input.nextLine());

			System.out.println("Your Long is: "+ userLong);


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}