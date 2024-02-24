import java.util.Calendar;
import java.time.LocalDate;


public class AgeCalculator {
    
    static final int SECONDS_PER_YEAR =31536000;//365*24*60*60
    static final int MILLISECONDS_CONST =1000;
    
    public static double calculate(String dob){//should return int   
        double birthYear = Double.parseDouble(dob.split("/")[2]);//split returns a string array. Assign the element at index 2 (yr portion) 
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
   
        return currentYear-birthYear;
    }
    
    public static double calcAgeSeconds(double age){ 
        return age*SECONDS_PER_YEAR;
    }
    
    public static double calcAgeMS(double age){ 
        return age*SECONDS_PER_YEAR*MILLISECONDS_CONST;
    }
    
    public static String ageHex(double age){
        return Integer.toHexString((int)age);
    }
     public static String ageBinary(double age){ 
        return Integer.toBinaryString((int)age);
    }
    
}