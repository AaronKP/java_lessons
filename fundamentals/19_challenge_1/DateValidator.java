import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateValidator {
    public static final String DOB_FORMAT="dd/MM/yyyy";//const string pattern for dob 
    //method to validate that the date is in the correct format
    public static boolean isValid(String dob){  
        boolean isValidFormat =false;
        //define format object using desired string pattern/format
        DateTimeFormatter dobFormat =DateTimeFormatter.ofPattern(DOB_FORMAT);
        
        try{// tohgetehr with parse, try is used for input validation
           //define local date object
            LocalDate.parse(dob,dobFormat);//
            isValidFormat=true;
        }catch(Exception e){
            System.out.println("Error occured:"+e);
        }
        return isValidFormat;
    }
}