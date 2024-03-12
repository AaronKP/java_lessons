import java.util.*;

public class ArrayTest3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        
        list.add("banana");
        list.add("kiwi");
        list.add("mango");
        list.add("grapes");
        list.remove(2);//remove at specified index
        list.remove("banana");//remove specified object
           
            System.out.println(list);
        
    }
}
