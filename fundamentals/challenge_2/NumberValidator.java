import java.util.regex.Pattern;

public class NumberValidator {
    public static boolean validate(String operand){
        boolean validOperand=false;
        Pattern numberPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        try{
            validOperand=numberPattern.matcher(operand).matches();
        }catch(Exception e){
            System.out.println("Error");
            validOperand=false;
        }
        return validOperand;
    }
}
