import java.util.*;

public class ArrayListTest8 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        List<String> list2= new ArrayList<String>();
        List<String> list3= new ArrayList<String>();
        
        list.add("banana");
        list.add("kiwi");
        list.add("mango");
        list.add("grapes");

        list2.add("apple");
        list2.add("orange");
        
        list3.add("Not a fruit");
        list3.add("A vegetable");
        
           
        System.out.println("Original list: "+list);
        list.addAll(list2);//append all to end 
        System.out.println("After adding list2:"+list);
        list.addAll(0, list3);// add all at certain index
        System.out.println("After adding list3:"+list);
        
    }
}