public class CatchingEg2 {
	public void doSomething() throws Exception{
		int i = 42;
		
		if(i > 30){
			throw new Exception("An error occurred");
		}
		System.out.println("Doing something...");
	}
}
