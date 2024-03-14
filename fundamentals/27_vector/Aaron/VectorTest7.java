import java.util.*;

public class VectorTest7 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<String>();
        Vector<String> v2= new Vector<String>();
        Vector<String> v3= new Vector<String>();
        
        v.add("banana");
        v.add("kiwi");
        v.add("mango");
        v.add("grapes");

        v2.add("apple");
        v2.add("orange");
        
        v3.add("Not a fruit");
        v3.add("A vegetable");
        
           
        System.out.println("Original list: "+v);
        v.addAll(v2);//append all to end 
        System.out.println("After adding v2:"+v);
        v.addAll(0, v3);// add all at certain index
        System.out.println("After adding v3:"+v);
        
    }
}
