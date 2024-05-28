import package1.*;
import package2.*;

public class Main extends Child{

	public Main(String name, String age,String hobby){
		
		super(name,age,hobby);
	}

	public static void main(String[] args) {
		myMethod1();
		myMethod2();
		child();
		family();

		Child child = new Child("Aaron","25");
	}
}