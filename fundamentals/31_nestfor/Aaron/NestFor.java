public class NestFor {
    public static void main(String[] args) {  
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print("Outer = "+i);
                System.out.println(" Inner = "+j);
            }           
        }
    }
}
