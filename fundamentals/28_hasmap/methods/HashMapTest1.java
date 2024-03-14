import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class HashMapTest1 {
	public static void main(String[] args) {
		HashMap<String,String> hashMap = new HashMap<>();
		
		hashMap.put("South Africa", "Johannesburg");
		hashMap.put("Canada", "Toronto");
		hashMap.put("France", "Paris");
		hashMap.put("Egypt", "Cairo");
		hashMap.put("Japan", "Osaka");
		
	
		try{

		Set keySet = hashMap.keySet();		
		Collection values = hashMap.values();
              
        Iterator ik =keySet.iterator();
        while(ik.hasNext()){
        	System.out.println(ik.next());
        }
                
        Iterator iv =values.iterator();
        while(iv.hasNext()){
            System.out.println(iv.next());
        }

		}catch(Exception E){

		}
			
		
	}	
}
