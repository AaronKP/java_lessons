public class MenuValidator {
    
    //methid validate if the operator macthes the 5 applicable operators. User can't entered operatrors outside the scope of the application
    //return boolean true or false 
    public static boolean validate(String operator){
        
        boolean validOperator =false;//if the operator is valid set to true
        //switch statement to determine if operator falls within allowed set of operators
        switch(operator){
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                validOperator=true;//if within range set valid to true
                break;
            default:
                validOperator=false;//else set valid to false
                break;
        }
            
        return validOperator;
    }
    
    //validate if the entered operator matches the menu option selected
    //params String operator, String menu option
    //return boolean true or false
     public static boolean validateOperatorEntered(String operatorEntered, String menuOpt){
        
    
        String operator=null;//local variable to store operator symbol based on menu option
        //switch statement to assign the corresponding operator of a menu item
        switch(menuOpt){
            case "1":
                operator="+";
                break;
            case "2":
                operator="-";
                break;
            case "3":
                operator="*";
                break;
            case "4":
                operator="/";
                break;
            case "5":
                operator="%";
                break;
            }
          
        return operatorEntered.equalsIgnoreCase(operator);//returns true if the user's entered operator matches the operator assigned to a menu item
    }
    
    //validate if the user is entering a valid menu item
    //params String menu option
    //return boolean true or false
    public static boolean validateMenuOpt(String opt){

        boolean validOption=false;//assigned to true if the menu option entered is valid
        try{
            int option=Integer.parseInt(opt);//check if input is a number. Throw exception if not
            //if input is a number then check if it falls within the set of valid menu option
            switch(option){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                validOption=true;//menu option is true if falls within these case constants
                break;
            default:
                validOption=false;
                break;

            }

        }catch(Exception e){
          
        }

        return validOption;//return if option is valid (true) or not valid (false)
        
    }

    //method to display custom error message when operator does not match menu option
    //params String menu option
    //return String message
     public static String displayWrongOperandMessage(String menuOpt){
        
    
        String message=null;//variable to be returned with custom error message based on the menu option
        switch(menuOpt){
            case "1":
                message="Operator for menu item ("+menuOpt+") addition is +";//case for addition option
                break;
            case "2":
                 message="Operator for menu item ("+menuOpt+") subtraction is -";
                break;
            case "3":
                 message="Operator for menu item ("+menuOpt+") multiplication is *";
                break;
            case "4":
                 message="Operator for menu item ("+menuOpt+") division is /";
                break;
            case "5":
                message="Operator for menu item ("+menuOpt+") modulus is %";
                break;
            }
          
        return message;
    }

}
