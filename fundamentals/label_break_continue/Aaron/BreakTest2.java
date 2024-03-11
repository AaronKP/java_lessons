public class BreakTest2 {
    public static void main(String[] args) {

        int i=0;
      outer:do{
            
            System.out.println("outer:"+i);
            int j=0;
            
            inner:do{
                System.out.println(" inner:"+j);
                 if(i == 2){
                 break inner;
                }
                 
                int k=0;
                innest:do{
                    System.out.println("  innest:"+k);
                    k++;
                }while(k<3);
                j++;
            }while(j<3);
            i++;
        }while(i<3);

    }
}
