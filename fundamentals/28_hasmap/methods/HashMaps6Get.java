import java.util.*;
public class HashMaps6Get {

    public static void main(String[] args) {
        HashMap <Integer, String> myHashMap =  new HashMap<>();
        myHashMap.put(22,"Aaron");
        myHashMap.put(23,"Goku");
     
        System.out.println("Contains key 22 ? "+myHashMap.containsKey(22)+"\nContains Value "+myHashMap.get(23)+" ? "+myHashMap.containsValue("Goku"));
    }
    
}