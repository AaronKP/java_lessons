/**
 *
 * @author Aaron Padiachy
 * Purpose : To calculate a result based on a selected mathematical operation involving arithmetic operators and operands supplied by the user
 * A selected option from a menu of arithmetic operations determines which operation is performed.
 */
public class Challenge2Main {

    public static void main(String[] args) {
        
        boolean proceed=true;//sentinel for continuous runnning of application.
        boolean validOperator;//operator/menu item loop control for validation
        boolean validOperand;//operand loop control for validation
        boolean validMenuOpt;//menu option loop control value for validation
        boolean useResult=false;//to track if user wishes to use previous result in next calculation
        //variables to store user input 
        String menuOpt=null;
        String response;
        String operand1=null;
        String operand2=null;
        String operator=null;
        String result=null;//for continued use of result in multiple run throughs

        //while loop to allow for continuous running of application
        while(proceed){
           validOperator=false;//reset to false on each iteration. Validation will set to true
           validOperand=false;
           validMenuOpt=false;
           MenuPrinter.printMenu();//print menu
           
           //validate menu option. Infinite unless the menu option selected is valid
           while(validMenuOpt==false){
               menuOpt=Prompter.prompt("Enter menu item (1-6):");
               validMenuOpt=MenuValidator.validateMenuOpt(menuOpt);
               System.out.println(validMenuOpt==false?"************************************\nERROR! Select from 1,2,3,4,5,6\n"
                       + "************************************":"Menu item ("+menuOpt+") selected\n************************************");
               if(menuOpt.equalsIgnoreCase("6")){//option 6 is to exit app
                  String ans=Prompter.prompt("Confirm: Y to end app, any other key to return\n************************************");//confirmation dialog/ user friendly
                  if(ans.equalsIgnoreCase("Y")){
                      System.out.println("Application Ended");
                      System.exit(0);//end application
                  }else{
                      validMenuOpt=false;//set to false so that the loop re-prompts for a menu item if the user does not exit.
                      MenuPrinter.printMenu();//print menu
                  }
               }
           }
           //if statement to determine operand 1.
           if(useResult){
               operand1=result;//set operand 1 to the result of last calculation per user request
           }else{
                   //validate first operand loop. 
               while(validOperand==false){
                   operand1=Prompter.prompt("Enter operand 1");//Obtain a new operand.
                   validOperand=NumberValidator.validate(operand1);
                   System.out.println((validOperand==false)?"************************************\nInput must be numeric\n"
                           + "************************************":"************************************\n"
                                   + "Operand ("+operand1+") Entered\n************************************");//conditional operator to display error message or confirmation message if operand 1 is valid           
               }
           }
           
           
            //check if menu item / operator is valid with infinite loop
           while(validOperator==false){
               operator=Prompter.prompt("Enter an operator + - * / %\n************************************");//capture operator
               validOperator=MenuValidator.validate(operator);//set loop control value based on whether operator is valid.
               System.out.println(validOperator==false?"************************************\nERROR! Select from + - * / %\n"
                       + "************************************":"Operator ("+operator+") Selected\n************************************");//conditional operator to display error message or confirmation message if operator is valid  
               if(MenuValidator.validateOperatorEntered(operator, menuOpt)==false){//validate if the operator entered matches the menu option chosen
                   System.out.println("Entered operator ("+operator+") & menu item:("+menuOpt+") don't correspond");
                   System.out.println(MenuValidator.displayWrongOperandMessage(menuOpt));//prompt to hint at correct operator
                   validOperator=false;
               }
           }
           
           validOperand=false;//reset loop control to false to validate second operand.
           
           //validate second operand
           while(validOperand==false){
               operand2=Prompter.prompt("Enter operand 2");//prompt for operand2
               validOperand=NumberValidator.validate(operand2);//validate if operand2 is a number
               System.out.println((validOperand==false)?"************************************\nInput must be numeric\n"
                       + "************************************":"************************************\n"
                               + "Operand ("+operand2+") Entered\n************************************");//conditional operator to display error message or confirmation message if operand2 is valid 
               //if statement to handle the event that operand 2 is 0 when the operator is / or %
               if(operator.equals("/")&&operand2.equals("0")){
                   validOperand=false;
                   System.out.println("\n************************************\nCannot perform a division by 0.\nRe-enter second operand"
                           + "\n************************************");
               }else if(operator.equals("%")&&operand2.equals("0")){
                   validOperand=false;
                   System.out.println("\n************************************\nCannot perform modulus by 0.\nRe-enter second operand"
                           + "\n************************************");
               }
           }
           //switch statement to display the result of the operation based on the operand chosen
           switch(operator){
               case "+":
                   result=Double.toString(Addition.add(operand1, operand2));
                   System.out.println("****************SUM*****************");
                   System.out.println(operand1+" + "+operand2+" = "+(result=Double.toString(Addition.add(operand1, operand2))));
                   System.out.println("************************************");
                   break;
               case "-":
                   System.out.println("************DIFFERENCE**************");
                   System.out.println(operand1+" - "+operand2+" = "+(result=Double.toString(Subtraction.subtract(operand1, operand2))));
                   System.out.println("************************************");
                   break;
               case "*":
                   System.out.println("**************PRODUCT****************");
                   System.out.println(operand1+" * "+operand2+" = "+(result=Double.toString(Multiplication.multiply(operand1, operand2))));
                   System.out.println("************************************");
                   break;
               case "/":
                   System.out.println("**************QUOTIENT**************");
                   System.out.println(operand1+" / "+operand2+" = "+(result=Double.toString(Division.divide(operand1, operand2))));
                   System.out.println("************************************");
                   break;
               case "%":
                   System.out.println("***************MODULO***************");
                   System.out.println(operand1+" % "+operand2+" = "+(result=Double.toString(Modulus.modulus(operand1, operand2))));
                   System.out.println("************************************");
                   break;
                   
           }
            //prompt user for next cycle of application   
           response=Prompter.prompt("Continue application? Enter Y to continue or any other key to exit");
           proceed= response.equalsIgnoreCase("Y") ? true :false;
           System.out.println(proceed==true?" ":"Application Ended");
           //prompt for continued use of result if the user wishes to run through the app again
           if(proceed){
               response=Prompter.prompt("Use result of last calculation? Y for yes, any other key for no");
               useResult= response.equalsIgnoreCase("Y") ? true :false;
           }
        }
    }
}
