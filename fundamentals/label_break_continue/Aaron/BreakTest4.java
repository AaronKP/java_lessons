public class BreakTest4 {
    public static void main(String[] args) {
       
       int i=0;
        outer:do{
            System.out.println("outer:"+i);
            int j=0;
            inner:do{
                System.out.println(" inner:"+j);
                if(i == 2){
                    j++;
                 continue inner;
                }
                int k=0;
                innest:do{
                      if(j == 2){
                        k++;
                        continue innest;
                     }
                    System.out.println("  innest:"+k);
                    k++;
                }while(k<3);
                j++;
            }while(j<3);
            i++;
        }while(i<3);
    }
}
