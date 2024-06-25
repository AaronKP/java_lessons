 public class ClassCastTest {
	public static void main(String[] args) {
		
		Object exception = new Object();
		
		System.out.println("Step 1");


		if (exception instanceof Exception){
			Exception exception2 = (Exception)exception;
		
			System.out.println("Step 2");
		}
		
	}
}
