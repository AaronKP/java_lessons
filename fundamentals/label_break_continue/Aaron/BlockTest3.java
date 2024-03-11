public class BlockTest3 {
    public static void main(String[] args) {
        System.out.println("Step 1");
       
        label1: {
            System.out.println("Step 2");
            label2: {
                System.out.println("Step 3");
                if(true){
                    break label1;
                }               
            }
            System.out.println("Step 4");
        }
        System.out.println("Step 5");
    }
}
