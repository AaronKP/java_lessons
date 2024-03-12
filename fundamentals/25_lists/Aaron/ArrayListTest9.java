import java.util.*;

public class ArrayListTest9 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        List<String> list2= new ArrayList<String>();
        List<String> list3= new ArrayList<String>();
        
        list1.add("banana");
        list1.add("kiwi");
        list1.add("mango");
        list1.add("grapes");
        list1.add("apple");
        list1.add("orange");

        list2.add("apple");
        list2.add("orange");
        
        list3.add("apple");
        list3.add("orange");
        
        System.out.println("list2 contains all elements of list1? "+list2.containsAll(list1));
        System.out.println("list2 contains all elements of list3? "+list2.containsAll(list3));
    }
}