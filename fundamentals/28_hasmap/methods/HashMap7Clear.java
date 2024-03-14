import java.util.*;
public class HashMap7Clear {

    public static void main(String[] args) {
        HashMap <Integer, String> myHashMap =  new HashMap<>();
        myHashMap.put(22,"Aaron");
        myHashMap.put(23,"Goku");
     
        System.out.println("Values and Size before clear: "+myHashMap.values()+"\t"+myHashMap.size());
        myHashMap.clear();
        System.out.println("Size after clear:"+myHashMap.size());
    }
    
}