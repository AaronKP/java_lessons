import java.util.*;
public class LinkedListMethods{
	public static void main(String[] args) {

		Queue <Integer>queue = new LinkedList<Integer>();
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(6);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		LinkedList<Integer> list = new LinkedList<>();
		list.push(22);
		list.push(2);
		list.push(1);
		list.push(12);
		System.out.println(list);
		list.pop();
		System.out.println(list);
		System.out.println("linked list size: "+list.size());
		System.out.println(list.contains(12));
		list.clear();
		list.addAll(queue);
		System.out.println(list.containsAll(queue));
		System.out.println(list);

		Iterator i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}

		Integer [] a = list.toArray(new Integer[list.size()]);
		System.out.println(a[2]);

	}
}