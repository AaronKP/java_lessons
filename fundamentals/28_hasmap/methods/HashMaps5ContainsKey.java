import java.util.*;
public class HashMaps5ContainsKey {

    public static void main(String[] args) {
        HashMap <Integer, String> myHashMap =  new HashMap<>();
        myHashMap.put(22,"Aaron");
        myHashMap.put(23,"Goku");
     
        System.out.println("Contains key 22 ? "+myHashMap.containsKey(22)+"\nContains Value Goku ? "+myHashMap.containsValue("Goku"));
    }
    
}