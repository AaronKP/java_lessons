 public class InstanceTest {
	public static void main(String[] args) {
		Object mary = new Mary();
	    boolean test  = (mary instanceof Person);
		System.out.println("Instance of returned ["+test+"]");
	}
}
