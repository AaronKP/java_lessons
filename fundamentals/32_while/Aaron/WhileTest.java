public class WhileTest {
    public static void main(String[] args) {
        int counter = 0;      
        while(counter < 10){
            if(counter%2==0 ){
                 System.out.println("Counter = "+counter);
            }
           counter++;
        }
    }
}
