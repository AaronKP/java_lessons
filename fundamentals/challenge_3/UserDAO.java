import java.time.LocalDate;//used to calcualte user age and parse DoB according to a certain format
import java.time.format.DateTimeFormatter;
import java.util.Calendar;//import used to calculate user's age
import java.util.regex.*;



public class UserDAO{
	//data fields/properties of the user. 
	private static String name="",surname="",email="",dob="",id="";
	//pattern for email validation
	private static String EMAIL_PATTERN="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	//flag variable for validation
	private static  boolean isValidInput;//default set to false
	//Multi-dimensional array as a database
	public static String [][]userDB= new String[1][5];
	//flag to identify if a user has been found on the database
	static boolean isEmailFound;
	//field that stores the index of the row of a located user
	private static int userRow=999_999;
	
	/**Mutator to set name field
	 * @param String userName
	 * @return void**/
	public static void setName(){
		name=Prompter.prompt("Enter user's name:");
	}

	/**accessor to return name field
	 * @param none
	 * @return String name**/
	public static String getName(){
		return name;
	}

	//set user surname
	public static void setSurname(){
		surname=Prompter.prompt("Enter user's Surname:");;
	}
	//return user surname
	public static String getSurname(){
		return surname;
	}

	//set user dob
	public static void setDoB(){
		isValidInput=false;//reset to false so that validation check is made using untampered flag
		while(isValidInput==false){
			isValidInput=DateValidator.isValid(dob=Prompter.prompt("Enter Date of Birth (dd/MM/yyyy):"));
			System.out.println(isValidInput==false?"Invalid date format":"");
		}
		System.out.println("Date of birth entered: ("+dob+")\n************************************");
	}
	//return user dob
	public static String getDoB(){
		return dob;
	}

	//set user email
	public static void setEmail(){
		isValidInput=false;
		//create pattern object for regex pattern we define for the email address
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		while(isValidInput==false){
			//Compare the user's entered String to see if it matched the pattern
			Matcher matcher=pattern.matcher(email=Prompter.prompt("Enter user email address:"));
			isValidInput =matcher.matches();
			System.out.println(isValidInput==false?"Invalid email address entered. Ensure format ***@***.***":"");
		}
	}
	//return user email
	public static String getEmail(){
		return email;
	}

	//set user id
	public static void setId(){
		isValidInput=false;
		id="";//clear previous ID
		char [] nrArray;//will be used to perform a number check on the entered string
		while(isValidInput==false){
			nrArray = Prompter.prompt("Enter SA ID:").toCharArray();
        	for (int i=0;i<nrArray.length;i++){//iterate throught the char array to find digits
	            if(Character.isDigit(nrArray[i])==false||nrArray.length>13){//if the array has more than 13 elements that not valid
	                System.out.println("Invalid SA ID entered. Ensure ID is 13 digits.");
	                isValidInput=false;
	                break;
	            }else{
	            	id=id+nrArray[i];
	            	isValidInput=true;
	            }
        	}
		}	
	}
	//return user id
	public static String getId(){
		return id;
	}



	//method to populate database i.e., populate with already validated, set fields.
	public static void create(String name, String surname, String dob, String email, String id){
		 //check if there is space in the original array . If not then expand its size
		 if(userDB[userDB.length-1][userDB[userDB.length-1].length-1]!=null){
            String[][] tempArray = new String[userDB.length+1][5];//used to expand the size of the array used to store values of db

            for(int row=0;row<userDB.length;row++){//populate new expanded array with original's values
            	for(int col=0;col<userDB[row].length;col++){
            		tempArray[row][col]=userDB[row][col];
            	}
            }

            userDB=tempArray;//set original to expanded array
         }
		//populate Database/array with new user in the empty available slot;
		userDB[userDB.length-1][0]=name;
		userDB[userDB.length-1][1]=surname;
		userDB[userDB.length-1][2]=dob;
		userDB[userDB.length-1][3]=email;
		userDB[userDB.length-1][4]=id;
	}


	//method to delete a user
	public static void delete(String email){
		String [] user=getUserByEmail(email);
		if(userDB.length==0){
			System.out.println("No users on database");
		
		}else if (isEmailFound==false) {
			System.out.println("Entered email address cannot be located.");
		}else{
			System.out.println("Record for: "+email+"\n************************************");
			System.out.println("******************************************************************DATABASE USERS******************************************************************");
			System.out.print("\nName\t\t\t\tSurname\t\t\t\tDoB\t\t\t\tEmail\t\t\t\t\tID");
			System.out.println("\n*************************************************************************************************************************************************");
			System.out.println();
			for (int i=0;i<user.length ;i++ ) {
				 System.out.printf("%-30s\t", user[i]);//format output
			}
			if(Prompter.prompt("\nConfirm delete: Y for yes, any other key to cancel").equalsIgnoreCase("y")){
				
				for (int i=0; i<userDB[userRow].length ;i++ ) {
					userDB[userRow][i]=null;//set row to null to mark as deleted.
				}

				String [][]tempArray;
				if(userDB.length==1){//trying to prevent index out of bounds
					tempArray = new String[1][5];//declare a temp array of size 1
				}else{//else if then array size is greater than 1 we can safely decrease its size by 1 without worry about index out of bounds
					tempArray = new String[userDB.length-1][5];//used to decrease the size of the array used to store values of db
				}
				int tempRow=0, tempCol=0;//used to iterate through temp array. Prevents index out of bound exception when null is encountered due to if statement

            	for(int row=0;row<userDB.length;row++){ //populate new contracted array with original's values excluding the "deleted" row	
            		for(int col=0;col<userDB[row].length;col++){
            			if(userDB[row][col]!=null){
            				tempArray[tempRow][tempCol]=userDB[row][col];
            				tempCol++;//iterates through the temp array columns
            			}
            			
            		}
            		//length-2 because the row will increment to be the value of length-2 Which is the same as the last row of the temp array
            		if(tempRow<userDB.length-2){//control the iteration over the rows. Temp array always has 1 fewer rows therefore counter must be less than orginal's last index
            			tempRow++;//iterate through temp array rows
            		}
            		
            	}

            	userDB=tempArray;//set original to contracted array
         	}
			
		}
	}

	//method to find a user
	public static String[] getUserByEmail(String email){
		isEmailFound=false;
		userRow=999_999;
		String [] user = new String[5];
		for (int row=0;row<userDB.length ;row++ ) {
			for (int col=0;col<userDB[row].length ;col++ ) {
				if (userDB[row][col]!=null && userDB[row][col].equalsIgnoreCase(email)) {
					isEmailFound=true;
					user = userDB[row];//set the record as user array when the email is located
					userRow=row;
				}
			}
		}
		return user;
	}

	//method to update a certain user's details
	public static void update(String name,String surname,String dob,String email,String id){
		userDB[userRow][0]=name;
		userDB[userRow][1]=surname;
		userDB[userRow][2]=dob;
		userDB[userRow][3]=email;
		userDB[userRow][4]=id;
		System.out.println("\n***********************************\nUser successfully updated\n***********************************");

	}

	//method to verify the details to be updated
	public static void getUpdates(String email){
		
		String [] user=getUserByEmail(email);
		if(userDB.length==0){
			System.out.println("No users on database");
		
		}else if (isEmailFound==false) {
			System.out.println("Entered email address cannot be located.");
		}else{
			System.out.println("Record for: "+email+"\n************************************");
			System.out.println("******************************************************************DATABASE USERS******************************************************************");
			System.out.print("\nName\t\t\t\tSurname\t\t\t\tDoB\t\t\t\tEmail\t\t\t\t\tID");
			System.out.println("\n*************************************************************************************************************************************************");
			System.out.println();
			for (int i=0;i<user.length ;i++ ) {
				 System.out.printf("%-30s\t", user[i]);//format output
			}
			if(Prompter.prompt("\nUpdate name?: Y for yes, any other key to cancel").equalsIgnoreCase("y")){
				setName();
				user[0]=getName();
			}
			if(Prompter.prompt("\nUpdate surname?: Y for yes, any other key to cancel").equalsIgnoreCase("y")){
				setSurname();
				user[1]=getSurname();
			}
			if(Prompter.prompt("\nUpdate DoB?: Y for yes, any other key to cancel").equalsIgnoreCase("y")){
				setDoB();
				user[2]=getDoB();
			}
			if(Prompter.prompt("\nUpdate Email?: Y for yes, any other key to cancel").equalsIgnoreCase("y")){
				setEmail();
				user[3]=getEmail();
			}
			if(Prompter.prompt("\nUpdate ID?: Y for yes, any other key to cancel").equalsIgnoreCase("y")){
				setId();
				user[4]=getId();
			}

			update(user[0],user[1],user[2],user[3],user[4]);

			
		}
	}

	//method to print array contents
	public static void print(){
		System.out.println("******************************************************************DATABASE USERS******************************************************************");
		System.out.print("\nName\t\t\t\tSurname\t\t\t\tDoB\t\t\t\tEmail\t\t\t\t\tID");
		System.out.println("\n*************************************************************************************************************************************************");
		System.out.println();
		for(int row=0;row<userDB.length;row++){//iterate through the 2D array
				
            	for(int col=0;col<userDB[row].length;col++){
            		 System.out.printf("%-30s\t", userDB[row][col]);//format output
            	}
            	System.out.println();
        }
        System.out.println("*************************************************************************************************************************************************");
	}

	//method to calculate user's age.
	public static double calcAge(){
		double birthYear = Double.parseDouble(dob.split("/")[2]);//split returns a string array. Assign the element at index 2 (yr portion) 
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // get Calendar instance based on locale settings and current date time. Fetch field YEAR
   
        return currentYear-birthYear;//return age
	}

	//method to print custom greeting
	public static void printGreeting(){
		System.out.println("***************************************************************************");
		System.out.println("Hello, "+name+" "+surname+"-age:("+calcAge()+") Your details have been saved to the database.");
		System.out.println("***************************************************************************");
	}

}