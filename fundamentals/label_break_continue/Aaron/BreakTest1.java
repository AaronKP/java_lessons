public class BreakTest1 {
    public static void main(String[] args) {
       
       int i=0;
       do{
        System.out.println("outer:"+i);
            if(i == 7){
                break;
            }
            i++;
       }
       while(i<10);
        
       
       
    }           
}
