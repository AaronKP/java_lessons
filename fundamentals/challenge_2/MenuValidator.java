public class MenuValidator {
    
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
    
     public static boolean validateOperandEntered(String operatorEntered, String menuOpt){
        
    
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
}
