import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateValidator {
    public static final String DOB_FORMAT="dd/MM/yyyy";//const string pattern for dob 
    //method to validate that the date is in the correct format
    public static boolean isValid(String dob){  
        boolean isValidFormat =false;
        //define format object using desired string pattern/format in static method patternOf()
        DateTimeFormatter dobFormat =DateTimeFormatter.ofPattern(DOB_FORMAT);
        
        try{// together with parse, try is used for input validation
           
            LocalDate.parse(dob,dobFormat);//static method parse. Parse dob according to specified format
            isValidFormat=true;
        }catch(Exception e){
            System.out.println("Error occured:"+e);//exception thrown if input is incorrect format
        }
        return isValidFormat;
    }
}