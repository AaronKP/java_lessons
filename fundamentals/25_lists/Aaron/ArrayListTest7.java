import java.util.*;

public class ArrayListTest7 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        
        list.add("banana");
        list.add("kiwi");
        list.add("mango");
        list.add("grapes");
        
           
        System.out.println(list);
        System.out.println(list.get(2));//get at index 2
        
    }
}