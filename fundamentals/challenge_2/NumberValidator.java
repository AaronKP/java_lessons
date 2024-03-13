import java.util.regex.Pattern;//import for regex to perform number validation

public class NumberValidator {
    //method validate if the operand entered by the user is valid number
    //params String operand
    public static boolean validate(String operand){
        boolean validOperand=false;//set to true if the number entered is a decimal or integer value
        Pattern numberPattern = Pattern.compile("-?\\d+(\\.\\d+)?");// pattern to check for optional -values, decimal values , integers 
        try{
            validOperand=numberPattern.matcher(operand).matches();//check if operand matches the defined pattern and set to true if it does
        }catch(Exception e){
            System.out.println("Error");
            validOperand=false; //set to false if the operand is not a number.
        }
        return validOperand;
    }
}
