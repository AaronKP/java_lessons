public class Conditionals3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        int result = 0;
        
        if (x > y){
            if (x > z){
                result = x;
            }
            else{
                result = z;
            }
        }else{ 
            if (y > z){ 
                result = y;
            }
             else {
             result = z;
            }
        }
        System.out.println("Maximum value is: " + result);
    }
}