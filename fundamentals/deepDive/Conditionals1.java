public class Conditionals1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 3;

        if (x > 5){
             if (y > 3){
                if (z > 2){
                    System.out.println("All conditions are met");
                }else{
                    System.out.println("z is not greater than 2");
                }
                
            }else{
                System.out.println("y is not greater than 3");
            }
            
        }else{
            System.out.println("x is not greater than 5");
        
        }
    }
}