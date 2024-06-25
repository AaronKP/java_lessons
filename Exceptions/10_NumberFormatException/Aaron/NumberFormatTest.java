public class NumberFormatTest {
	public static void main(String[] args) {
		
		String number = "2345Q";
		
		System.out.println("Step 1");
		
		try{
			int converted = Integer.parseInt(number);
			System.out.println("Step 2");
	
		}catch(NumberFormatException n){
			System.out.println("Numberformat exception occured"+n);
		}
		
		}
		
		
}
