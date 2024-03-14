import java.util.*;

public class VectorTest2 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("strawberry");
        v.add("orange");
        v.remove(0);//remove at certain index
        v.remove("orange");//remove certain element
           
        System.out.println(v);
        
    }
}