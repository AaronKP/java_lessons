public class Challenge3Main{
	public static void main(String[] args) {
		boolean proceed=true;//flag that controls continued application usage
		boolean validMenuOpt;
		String menuOpt=null;//store the menu option the user selects 
		String response=null;// used to store user input in response to prompts

		//Controls multiple re-runs of application based on user preference 
		while(proceed){
			response="";
			validMenuOpt=false;
			//print menu
			MenuPrinter.printMenu();
			//validate menu option
			while(validMenuOpt==false){
				//retrieve option from user;
				menuOpt=Prompter.prompt("Select menu option (1-5)");

				validMenuOpt=MenuValidator.validateMenuOpt(menuOpt);
				System.out.println(validMenuOpt==false?"Option("+menuOpt+") is invalid"
					+"\n************************************":"");
			}

			switch(menuOpt){
			case "1":
				UserDAO.setName();
				UserDAO.setSurname();
				UserDAO.setDoB();
				UserDAO.setEmail();
				UserDAO.setId();
				UserDAO.create(UserDAO.getName(),UserDAO.getSurname(),UserDAO.getDoB(),UserDAO.getEmail(),UserDAO.getId());
				UserDAO.printGreeting();
				break;
			case "2":
				UserDAO.delete(Prompter.prompt("Email address of user to be delete:"));
				break;

			case "3":
				UserDAO.getUpdates(Prompter.prompt("Email address of user to be updated:"));
				break;
			case "4":
				UserDAO.print();
				break;
			case "5":
				response=Prompter.prompt("Confirm exit: Y to exit, any other key to return.");//store confirmation
				proceed= response.equalsIgnoreCase("Y")? false: true;//decide on whether to re-run based on confirmation
				if(proceed==false){
					System.out.println("\n************************************\nApplication Ended"
					+"\n************************************");//prompt for app end if confirmed exit
					System.exit(0);
				}
				
				break;
			}
			if(response.equalsIgnoreCase("")){//if option 5 was not selected display this message
				response=Prompter.prompt("Continue running application? Y for yes, any other key exit");
				proceed= response.equalsIgnoreCase("Y")? true: false;//decide on whether to re-run based on confirmation
				if(proceed==false){
					System.out.println("\n************************************\nApplication Ended"
					+"\n************************************");//prompt for app end if confirmed exit
					System.exit(0);
				}
			}
			

		}
	}
}