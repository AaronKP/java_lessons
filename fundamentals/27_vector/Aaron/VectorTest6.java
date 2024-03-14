import java.util.*;

public class VectorTest6 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<String>();
        
        v.add("banana");
        v.add("kiwi");
        v.add("mango");
        v.add("grapes");
        
           
        System.out.println(v);
        System.out.println(v.get(2));//get at index 2
        
    }
}
