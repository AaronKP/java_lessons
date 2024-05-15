public class PassByVal1 {
	public static void main(String[] args) {
		int value = 0;
		
		System.out.println("Value = "+value);
		
		PassByVal2 passByVal2 = new PassByVal2();
		
		passByVal2.changeValue(value);
		
		System.out.println("Value = "+value);
	}
}
