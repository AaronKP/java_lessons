package za.access;

public class ExtenderAccessor extends AccessMe{
	 public static void main(String[] args) {
	 	System.out.println("Name is: "+getProperty());
	 }

	 public static String getProperty(){
	 	ExtenderAccessor.setName("Bean");
	 	return ExtenderAccessor.getName();
	 }
}