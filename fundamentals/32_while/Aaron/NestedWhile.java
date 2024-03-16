public class NestedWhile {
    public static void main(String[] args) { 
        int i =0;
        while(i<5){
            System.out.println("Outer = "+i);
            int j=0;
            while(j<5){
                System.out.println(" Inner = "+j);
                j++;
            }

            i++;
        } 
        
    }
}
