public class Modulus {
    //method to perform modulus operation between two operands
    //params String operand 1, String Operand 2
    //return type double
    public static double modulus(String op1, String op2){
        return Double.parseDouble(op1)%Double.parseDouble(op2);//return the modulo of the two operands
    }
}