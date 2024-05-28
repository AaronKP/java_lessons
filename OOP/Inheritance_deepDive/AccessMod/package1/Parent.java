package package1;

public class Parent{

	public Parent (String name, String age)throws NumberFormatException{
		try{
			int parentAge = Integer.parseInt(age);
			System.out.println("I am a Parent Constructor.");
		}catch(NumberFormatException e){
			System.out.println("Error: "+e);
		}
	}

	protected static void family(){
		System.out.println("I am a parent");
	}

	public static void myMethod1(){
		System.out.println("I belong here.");
	}
}