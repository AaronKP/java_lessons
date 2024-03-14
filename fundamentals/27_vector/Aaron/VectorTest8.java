import java.util.*;

public class VectorTest8 {
    public static void main(String[] args) {

        Vector<String> v1 = new Vector<String>();
        Vector<String> v2= new Vector<String>();
        Vector<String> v3= new Vector<String>();
        
        v1.add("banana");
        v1.add("kiwi");
        v1.add("mango");
        v1.add("grapes");
        v1.add("apple");
        v1.add("orange");

        v2.add("apple");
        v2.add("orange");
        
        v3.add("apple");
        v3.add("orange");
        
        System.out.println("v2 contains all elements of list1? "+v2.containsAll(v1));
        System.out.println("v2 contains all elements of list3? "+v2.containsAll(v3));
    }
}
