import java.util.*;

public class VectorTest9 {
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
        
        Iterator iterator =v1.iterator();//create iterator object
        System.out.print("v1 elements:");
        while(iterator.hasNext()){//while object has values 
            System.out.print(" "+iterator.next());//output the value
        }
       
    }
}
