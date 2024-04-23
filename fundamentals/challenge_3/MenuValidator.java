public class MenuValidator{

	//validate if the user is entering a valid menu item
    //params String menu option
    //return boolean true or false
    public static boolean validateMenuOpt(String opt){

        boolean validOption=false;//assigned to true if the menu option entered is valid
        try{
            int option=Integer.parseInt(opt);//check if input is a number. Throw exception if not
            //if input is a number then check if it falls within the set of valid menu option
            switch(option){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                validOption=true;//menu option is true if falls within these case constants
                break;
            default:
                validOption=false;
                break;

            }

        }catch(Exception e){
          
        }

        return validOption;//return if option is valid (true) or not valid (false)
        
    }


}