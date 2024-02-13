import java.util.Scanner;

public class ByteConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a byte ");

			
			double userByte = Byte.parseByte(input.nextLine());

			System.out.println("Your byte is: "+ userByte);


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}