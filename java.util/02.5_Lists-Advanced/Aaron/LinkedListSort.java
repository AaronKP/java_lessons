import java.util.*;

public class LinkedListSort{
	public static void main(String[] args) {

		LinkedList <Long> linkedlist = new LinkedList<>();
		linkedlist.add(200L);
		linkedlist.add(400L);
		linkedlist.add(98L);
		linkedlist.add(22L);

		Collections.sort(linkedlist);
		System.out.println(linkedlist);

		
	}
}