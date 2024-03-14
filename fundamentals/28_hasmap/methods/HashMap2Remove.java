import java.util.*;

public class HashMap2Remove{
	public static void main(String [] args){
		HashMap <Integer, String> myHashMap =  new HashMap<>();
        myHashMap.put(22,"Aaron");
        myHashMap.put(23,"Goku");
        
        myHashMap.remove(23);//remove PAIR with key 23
        System.out.println(myHashMap.remove(22,"a"));//remove pair only if key and value correspond
        System.out.println(myHashMap.size());//size is 1
	}
}