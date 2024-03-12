/**
 *
 * @author Aaron Padiachy
 * Purpose : To calculate a result based on a selected mathematical operation involving arithmetic operators and operands supplied by the user
 * A selected option from a menu of arithmetic operations determines which operation is performed.
 */
public class Challenge2Main {

    public static void main(String[] args) {
        
        boolean proceed=true;//sentinel for continuous runnning of application.
        boolean validOperator;//operator/menu item sentinel
        boolean validOperand;//operand sentinel
        boolean validMenuOpt;
        boolean useResult=false;
        String menuOpt=null;
        String response;
        String operand1=null;
        String operand2=null;
        String operator=null;
        String result=null;//for continued use of result in multiple run throughs

        
        while(proceed){
           validOperator=false;
           validOperand=false;
           validMenuOpt=false;
           MenuPrinter.printMenu();//print menu
           
           //validate menu option
           while(validMenuOpt==false){
               menuOpt=Prompter.prompt("Enter menu item (1-6):");
               validMenuOpt=MenuValidator.validateMenuOpt(menuOpt);
               System.out.println(validMenuOpt==false?"************************************\nERROR! Select from 1,2,3,4,5,6\n"
                       + "************************************":"Menu item ("+menuOpt+") selected\n************************************");
               if(menuOpt.equalsIgnoreCase("6")){
                  String ans=Prompter.prompt("Confirm: Y to end app, any other key to return\n************************************");
                  if(ans.equalsIgnoreCase("Y")){
                      System.out.println("Application Ended");
                      System.exit(0);
                  }else{
                      validMenuOpt=false;
                      MenuPrinter.printMenu();//print menu
                  }
               }
           }
           
           if(useResult){
               operand1=result;//set operand 1 to the result of last calculation
           }else{
                   //validate first operand
               while(validOperand==false){
                   operand1=Prompter.prompt("Enter operand 1");
                   validOperand=NumberValidator.validate(operand1);
                   System.out.println((validOperand==false)?"************************************\nInput must be numeric\n"
                           + "************************************":"************************************\n"
                                   + "Operand ("+operand1+") Entered\n************************************");           
               }
           }
           
           
            //check if menu item / operator is valid with infinite loop
           while(validOperator==false){
               operator=Prompter.prompt("Enter an operator + - * / %\n************************************");
               validOperator=MenuValidator.validate(operator);//set sentinel value based on whether menu item is valid.
               System.out.println(validOperator==false?"************************************\nERROR! Select from + - * / %\n"
                       + "************************************":"Operator ("+operator+") Selected\n************************************");
               if(MenuValidator.validateOperatorEntered(operator, menuOpt)==false){//validate if the operator entered matches the menu option chosen
                   System.out.println("Entered operator ("+operator+") & menu item:("+menuOpt+") don't correspond");
                   System.out.println(MenuValidator.displayWrongOperandMessage(menuOpt));
                   validOperator=false;
               }
           }
           
           validOperand=false;//resent sentinel to validate second operand
           
           //validate second operand
           while(validOperand==false){
               operand2=Prompter.prompt("Enter operand 2");
               validOperand=NumberValidator.validate(operand2);
               System.out.println((validOperand==false)?"************************************\nInput must be numeric\n"
                       + "************************************":"************************************\n"
                               + "Operand ("+operand2+") Entered\n************************************");
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
   
           response=Prompter.prompt("Continue application? Enter Y to continue or any other key to exit");
           proceed= response.equalsIgnoreCase("Y") ? true :false;
           System.out.println(proceed==true?" ":"Application Ended");
           //prompt for continued use of result 
           if(proceed){
               response=Prompter.prompt("Use result of last calculation? Y for yes, any other key for no");
               useResult= response.equalsIgnoreCase("Y") ? true :false;
           }
        }
    }
}
