import java.util.*;

public class VectorSort{
	public static void main(String[] args) {

		Vector <Long> vector = new Vector<>();
		vector.add(20L);
		vector.add(4000L);
		vector.add(98L);
		vector.add(22L);

		Collections.sort(vector);
		System.out.println(vector);

		
	}
}