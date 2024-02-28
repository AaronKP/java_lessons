import java.util.regex.Pattern;

public class GradeValidator {
    
    private static boolean isGradeValid =false;
    private static Pattern gradePattern = Pattern.compile("^(1[0-2]|[1-9])$");//regex pattern for digits 1-12
    
    public static boolean validateGrade(String grade){
        
            try{
                if(gradePattern.matcher(grade).matches()){
                    isGradeValid=true;//set as true i.e., valid
                   
                }else{
                    System.out.println("Invalid grade entered");
                }
            }catch(Exception e){
                System.out.println("Not a valid grade. "+"Error: "+e);
            }
        
        return isGradeValid;// return invalid otherwise
    }
}
