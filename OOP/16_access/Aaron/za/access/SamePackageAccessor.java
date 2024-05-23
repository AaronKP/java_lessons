package za.access;
public class SamePackageAccessor{
	public static void main(String[] args) {
		System.out.println("returned name is: "+getProperty());
	}

	public static String getProperty(){

		AccessMe am = new AccessMe();
		am.setName("Bean");

		return am.getName();

	}
}