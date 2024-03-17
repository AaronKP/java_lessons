public class DoWhileTest1 {
    public static void main(String[] args) {
        int counter = 0;      
        do{
            if(counter%2==0){
                System.out.println("Counter = "+counter);
            }
           
        }while(counter++ < 10);
    }
}
