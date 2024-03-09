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
}
