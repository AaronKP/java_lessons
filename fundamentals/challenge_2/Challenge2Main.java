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
        String response;
        String operand1=null;
        String operand2=null;
        String operator=null;
        
        while(proceed){
           validOperator=false;
           validOperand=false;
           MenuPrinter.printMenu();//print menu
           
           //check if menu item / operator is valid with infinite loop
           while(validOperator==false){
               operator=Prompter.prompt("Enter an operation + - * / %\n************************************");
               validOperator=MenuValidator.validate(operator);//set sentinel value based on whether menu item is valid.
               System.out.println(validOperator==false?"************************************\nERROR! Select from + - * / %\n"
                       + "************************************":"Operator ("+operator+") Selected\n************************************");
           }
           
           //validate first operand
           while(validOperand==false){
               operand1=Prompter.prompt("Enter operand 1");
               validOperand=NumberValidator.validate(operand1);
               System.out.println((validOperand==false)?"************************************\nInput must be numeric\n"
                       + "************************************":"************************************\n"
                               + "Operand ("+operand1+") Entered\n************************************");           
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
                   System.out.println("****************SUM*****************");
                   System.out.println(operand1+" + "+operand2+" = "+Addition.add(operand1, operand2));
                   System.out.println("************************************");
                   break;
               case "-":
                   System.out.println("************DIFFERENCE**************");
                   System.out.println(operand1+" - "+operand2+" = "+Subtraction.subtract(operand1, operand2));
                   System.out.println("************************************");
                   break;
               case "*":
                   System.out.println("**************PRODUCT****************");
                   System.out.println(operand1+" * "+operand2+" = "+Multiplication.multiply(operand1, operand2));
                   System.out.println("************************************");
                   break;
               case "/":
                   System.out.println("**************QUOTIENT**************");
                   System.out.println(operand1+" / "+operand2+" = "+Division.divide(operand1, operand2));
                   System.out.println("************************************");
                   break;
               case "%":
                   System.out.println("***************MODULO***************");
                   System.out.println(operand1+" % "+operand2+" = "+Modulus.modulus(operand1, operand2));
                   System.out.println("************************************");
                   break;
                   
           }
   
           response=Prompter.prompt("Continue application? Enter Y to continue or any other key to exit");
           proceed= response.equalsIgnoreCase("Y") ? true :false;
           System.out.println(proceed==true?" ":"Application Ended");
        }
    }
}
