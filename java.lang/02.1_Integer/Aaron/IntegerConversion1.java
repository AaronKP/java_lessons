public class IntegerConversion1{
	public static void main(String[] args) {
		//int to Integer
		Integer value = Integer.valueOf(10);
		//Integer to String
		String stringValue = value.toString();
		System.out.println("original value: "+stringValue);

		// String to Integer
		Integer value2 = Integer.valueOf(stringValue);
		System.out.println("value 2: "+value2);

		//Integer to int
		int x = value2.intValue();
		System.out.println("Integer to int: "+x);
	}
}