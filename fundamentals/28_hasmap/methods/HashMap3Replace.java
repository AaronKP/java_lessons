import java.util.*;

public class HashMap3Replace{
	public static void main(String [] args){
		HashMap <Integer, String> myHashMap =  new HashMap<>();
        myHashMap.put(22,"Aaron");
        myHashMap.put(23,"Goku");
        
        myHashMap.replace(22,"AK");//Replaces the value at key 22 with AK
        
        System.out.println("Value replaced ? "+myHashMap.replace(22,"AK","Goku")+"\n"+myHashMap.get(22));//replacces AK with Goku ony if pair and value match
	}
}