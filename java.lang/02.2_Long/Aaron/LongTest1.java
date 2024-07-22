public class LongTest1{
	public static void main(String[] args) {
		Long value =  new Long (10l);
		System.out.println(value);

		Long value1 = new Long("100");
		System.out.println(value1.toString());

		//String to Long
		Long value2 = Long.valueOf("22");
		System.out.println(value2);

		//Long to long
		long myLong = value2.longValue();
		System.out.println(myLong);

		//long to Long
		Long l = Long.valueOf(500);
		System.out.println(l);

		//String to long
		long ll = Long.parseLong("22");
		System.out.println(ll);

	}
}