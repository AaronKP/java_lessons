import za.access.*;

public class PublicAccessor{
	public static void main(String[] args) {
		System.out.println("Returned name is: "+getProperty());
	}

	public static String getProperty(){

		AccessMe am = new AccessMe();
		am.setName("Bean");

		return am.getName();

	}
}