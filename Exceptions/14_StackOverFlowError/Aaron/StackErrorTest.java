 public class StackErrorTest {	
	static int counter =5;
	public static void main(String[] args) {
		Someclass s = new Someclass();
		if(counter>=5){
			counter--;
			main(args);

		}
		
		System.out.println("Step 1");
	}
}
