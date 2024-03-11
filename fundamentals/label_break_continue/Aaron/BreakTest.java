public class BreakTest {
    public static void main(String[] args) {
       
        int limit = 7;
        int i =0;

        do{
            System.out.println("Counter ="+i);
            if(i == limit)
                break;
            i++;
        }
        while(i<10);

        
    }
}
