public class MyLambda implements MyInterface{

	@Override
	public void testingLambda(){
		MyInterface myInterface =()->System.out.println("implementation complete");
		myInterface.testingLambda();
	}
}