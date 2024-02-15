public class ShortCircuit3 {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println("Before a ="+a);
        a = !a;   
        System.out.println("After a ="+a);
    }
}
