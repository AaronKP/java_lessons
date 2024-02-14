import java.util.Scanner;

public class BuildingCSV{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		boolean proceed = true;
		String newUserRow ="Name,Surname,Age";
		int menuOption =0;

		
		while(proceed){

			printMenu();
			menuOption= input.nextInt();

			switch(menuOption){
			case 1: 
				input.nextLine();
				System.out.println("Enter user info in format: name,surname,age");
				newUserRow = newUserRow +"\n" + input.nextLine();
				System.out.println("New user successfully captured\n");

				break;
			case 2:
				System.out.println(newUserRow);
				break;
			case 3:
				proceed=false;

			}

			
		}

	}

	public static void printMenu(){
		System.out.println(">>>>>>>>>>>>>>Menu<<<<<<<<<<<<<<");
		System.out.println("(1) Capture new user\n(2) Print CSV\n(3) Exit");
	}
}