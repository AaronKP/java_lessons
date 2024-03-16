public class NestedFor {
    public static void main(String[] args) {  
        for(int i = 0;i<5;i++){
            System.out.println("Outer = "+i);
            for(int i = 0;i<5;i++){
                System.out.println(" Inner = "+j);
            }           
        }
    }
}
