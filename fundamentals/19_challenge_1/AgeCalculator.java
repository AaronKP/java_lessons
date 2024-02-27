import java.util.Calendar;
import java.time.LocalDate;


public class AgeCalculator {
    
    //constants for calculations
    static final int SECONDS_PER_YEAR =31536000;//365*24*60*60
    static final int MILLISECONDS_CONST =1000;
    
    //method to calculate user's age.
    //params (dob: string)
    //return double
    public static double calculate(String dob){//should return int   
        double birthYear = Double.parseDouble(dob.split("/")[2]);//split returns a string array. Assign the element at index 2 (yr portion) 
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // get Calendar instance based on locale settings and current date time. Fetch field YEAR
   
        return currentYear-birthYear;
    }
    
    //method to perform conversion of age in years to seconds
    //params (dob: double)
    //return double
    public static double calcAgeSeconds(double age){ 
        return age*SECONDS_PER_YEAR;
    }
    
    //method to perform conversion of age in years to milliseconds
    //params (dob: double)
    //return double
    public static double calcAgeMS(double age){ 
        return age*SECONDS_PER_YEAR*MILLISECONDS_CONST;
    }
    
    //method to perform conversion of age in years to hexadecimal equivalent
    //params (dob: double)
    //return String
    public static String ageHex(double age){
        return Integer.toHexString((int)age);//convert to corr hex string representation
    }

    //method to perform conversion of age in years to to binary equivalent
    //params (dob: double)
    //return String
     public static String ageBinary(double age){ 
        return Integer.toBinaryString((int)age);//convert to corr binary string representation
    }
    
}