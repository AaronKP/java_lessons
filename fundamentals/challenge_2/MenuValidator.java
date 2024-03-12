public class MenuValidator {
    
    //validate if the operator macthes the 5 applicable operators
    public static boolean validate(String operator){
        
        boolean validOperator =false;
        switch(operator){
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                validOperator=true;
                break;
            default:
                validOperator=false;
                break;
        }
            
        return validOperator;
    }
    
    //validate if the entered operator matches the menu option
     public static boolean validateOperatorEntered(String operatorEntered, String menuOpt){
        
    
        String operator=null;
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
          
        return operatorEntered.equalsIgnoreCase(operator);
    }
    
    //validate if the user is entering a valid menu item
    public static boolean validateMenuOpt(String opt){

        boolean validOption=false;
        try{
            int option=Integer.parseInt(opt);

            switch(option){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                validOption=true;
                break;
            default:
                validOption=false;
                break;

            }

        }catch(Exception e){
          
        }

        return validOption;
        
    }

    //custom error message when operator does not match menu option
     public static String displayWrongOperandMessage(String menuOpt){
        
    
        String message=null;
        switch(menuOpt){
            case "1":
                message="Operator for menu item ("+menuOpt+") addition is +";
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
