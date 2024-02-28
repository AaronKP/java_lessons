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

public class NumberValidator {
    public static boolean isValid(String km) {
        if (km == null || km.isEmpty()) {
            return false; // Null or empty string is not a valid number
        }

        try {
            Double.parseDouble(km);
            return true; // Parsing successful, input is a valid number
        } catch (NumberFormatException e) {
            return false; // Parsing failed, input is not a valid number
        }
    }
}

//set the precision of the miles calculated to 2 decimal places to avoild irrational numbers
 private static String formatMiles(String miles) {
        double milesDouble = Double.parseDouble(miles);
        return String.format("%.2f", milesDouble);
}



package challenge1main;
import java.util.Scanner;

public class Challenge1Main {
    public static void main(String[] args) {
        //declarations
        String name =null;//set to null. String immutable
        String surname=null;
        String date_of_birth=null;
        String distance_from_store=null;
        boolean validDistance = false;
        boolean validDate =false;
        
        //String array of prompts for user input
         String [] prompts = {
            "What is your name?",
            "What is your Surname",
            "Enter your date of birth (DD/MM/YYYY)",
            "How far is your favourite store from your home (km)?"
        };
        Scanner in = new Scanner(System.in);
        
        boolean cont= true;
        while(cont){
             for (int i = 0; i < prompts.length; i++) {
            switch(i){
                case 0:
                    name=Prompter.prompt(prompts[i]);
                    break;
                case 1:
                    surname =Prompter.prompt(prompts[i]);
                    break;
                case 2:
                    date_of_birth=Prompter.prompt(prompts[i]);
                    boolean validDob=false; 
                    
                    chkDob:while(validDob==false){
                        if(DateValidator.isValid(date_of_birth)==true){
                            validDate=true;
                            break chkDob;
                        }else{
                            //System.out.println("Invalid date of birth input");
                            date_of_birth=Prompter.prompt(prompts[i]);
                            validDob=false;
                        }
                    }
                    break;
                case 3:
                    distance_from_store=Prompter.prompt(prompts[i]);
                    boolean valid= false;
                    
                    chk:while(valid==false){
                        if(NumberValidator.isValid(distance_from_store)==true){
                            validDistance=true;
                            break chk;
                        }else{
                            System.out.println("Please enter a valid distance(km)");
                            distance_from_store=Prompter.prompt(prompts[i]);
                            valid=false;
                        }
                    }
                    break;
            }
        }
            Printer.print(name, surname, date_of_birth,Double.toString(MilesCalculator.calculate(distance_from_store)));  
            System.out.println("Continue running app? Enter Y to continue or any other key to exit ");
            //in.nextLine();
            if(in.nextLine().equalsIgnoreCase("Y")){
                cont= true;
            }else{
                System.out.println("*********Application Ended*********");
                cont= false;
            }
        }
        
    }
}
