public class MilesCalculator {
    
    private static final double MILES_CONST =1.609344;// declared as final. Not magic nr
    private static final int METERS_CONST =1000;
    //method to  convert km to miles
    public static double calculate(String km){
        return Double.parseDouble(km)/MILES_CONST;//return converted km to miles
    } 
     //method to convert km to m 
    public static double convertToMeters(String km){
        return Double.parseDouble(km)*METERS_CONST;
    }
    
}