import java.util.Scanner;

public class StringConcatenation{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		boolean proceed = true;
		String userSentence;
		String masterLine = "Your sentence(s) : ";

		while(proceed==true){

			System.out.println("Enter a sentence: ");
			userSentence=input.nextLine();
			masterLine= masterLine + "\n" + userSentence.trim();

			System.out.println(masterLine);
			System.out.println("Do you want to enter another sentence? N/ Y");
			if(input.nextLine().equalsIgnoreCase("Y")){

				continue;

			}else if(input.nextLine().equalsIgnoreCase("N")){

				proceed = false;

			}
		}

	}
}