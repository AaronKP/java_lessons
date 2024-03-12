import java.util.*;

public class ArrayListTest6 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        
        list.add("banana");
        list.add("kiwi");
        list.add("mango");
        list.add("grapes");
        
           
        System.out.println(list);
        System.out.println(list.contains("kiwi"));
        
    }
}