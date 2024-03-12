import java.util.*;

public class ArrayListTest11 {
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
        
        //specify array type and size in brackets
        String [] fruitArray = list1.toArray(new String[list1.size()]);
        for(String fruit: fruitArray){
            System.out.println(fruit);
       
        }
       
    }
}