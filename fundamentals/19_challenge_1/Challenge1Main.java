public class Challenge1Main {
    public static void main(String[] args) {
        //declarations
        String name =null;//set to null. String immutable
        String surname=null;
        String date_of_birth=null;
        String distance_from_store=null;
        boolean validDistance = false;
        boolean validDate =false;
        
        //String array of prompts for user input
         String [] prompts = {
            "What is your name?",
            "What is your Surname",
            "Enter your date of birth (DD/MM/YYYY)",
            "How far is your favourite store from your home (km)?"
        };
         
         for (int i = 0; i < prompts.length; i++) {
            switch(i){
                case 0:
                    name=Prompter.prompt(prompts[i]);
                    break;
                case 1:
                    surname =Prompter.prompt(prompts[i]);
                    break;
                case 2:
                    date_of_birth=Prompter.prompt(prompts[i]);
                    boolean validDob=false; 
                    
                    chkDob:while(validDob==false){
                        if(DateValidator.isValid(date_of_birth)==true){
                            validDate=true;
                            break chkDob;
                        }else{
                            //System.out.println("Invalid date of birth input");
                            date_of_birth=Prompter.prompt(prompts[i]);
                            validDob=false;
                        }
                    }
                    break;
                case 3:
                    distance_from_store=Prompter.prompt(prompts[i]);
                    boolean valid= false;
                    
                    chk:while(valid==false){
                        if(NumberValidator.isValid(distance_from_store)==true){
                            validDistance=true;
                            break chk;
                        }else{
                            System.out.println("Please enter a valid distance(km)");
                            distance_from_store=Prompter.prompt(prompts[i]);
                            valid=false;
                        }
                    }
                    break;
            }
        }
            Printer.print(name, surname, date_of_birth,Double.toString(MilesCalculator.calculate(distance_from_store)));  
    }
}