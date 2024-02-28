public class NameSurnameValidator {
    //check if name and surname are not empty or null
    public static boolean validateNameSurname(String name, String surname){
        if(name.equals(null)||name.equals("")||surname.equals(null)||surname.equals("")){
            System.out.println("Name or Surname cannot be empty");
            return false;//if invalid return false
        }
        return true;// return true if valid
    }
}
