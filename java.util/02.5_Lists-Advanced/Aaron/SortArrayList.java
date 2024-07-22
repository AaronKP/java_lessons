import java.util.*;

public class SortArrayList{
	public static void main(String[] args) {

		ArrayList <Long> arrayList = new ArrayList<>();
		arrayList.add(200L);
		arrayList.add(400L);
		arrayList.add(98L);
		arrayList.add(22L);

		Collections.sort(arrayList);
		System.out.println(arrayList);

		
	}
}