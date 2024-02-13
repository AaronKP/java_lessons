import java.util.Scanner;

public class CharConversion{
	public static void main(String [] args){

		
		try{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a char ");

			
			String userString = input.nextLine();

			char [] userChar = new char[userString.length()];

			for(int i =0 ; i< userString.length();i++){
				userChar[i]= userString.charAt(i);
			}

			for(int a =0 ; a< userChar.length;a++){
				System.out.println("Your char is: "+ userChar[a]);
			}

			


		}
		catch(Exception e){

			System.out.println("Error:"+ e);

		}

	}
}