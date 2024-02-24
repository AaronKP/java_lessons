import java.util.regex.Pattern;

public class NumberValidator {
    //regex pattern used to determine if the entered string is numeric.
    //-? checks for option negative signs,
    //\\d+ - checks for one or more numbers,
    //(\\.\\d)? checks for optional decimals
    private static Pattern numericPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    
    public static boolean isValid(String km){
        boolean isNumeric =false;
        
        if(km==null){// if user did not enter a value assign to null
            isNumeric =false;
        }else if (numericPattern.matcher(km).matches()==true){
            isNumeric =true;
        }else{
            isNumeric =false;
        }   
        return isNumeric;
    }
}