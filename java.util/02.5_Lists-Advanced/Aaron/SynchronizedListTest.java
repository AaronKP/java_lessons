import java.util.*;

public class SynchronizedListTest{
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		List<Integer> sync1= Collections.synchronizedList(list);

		Vector <Integer> vector = new Vector<>();
		List<Integer> sync2 = Collections.synchronizedList(vector);

		ArrayList <Integer> arrayList = new ArrayList<>();
		List<Integer> sync3 = Collections.synchronizedList(arrayList);
	}
}