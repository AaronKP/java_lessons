import java.util.*;

public class VectorTest10 {
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
        
        //specify array type and size in brackets
        String [] fruitArray = v1.toArray(new String[v1.size()]);
        for(String fruit: fruitArray){
            System.out.println(fruit);
       
        }
       
    }
}
