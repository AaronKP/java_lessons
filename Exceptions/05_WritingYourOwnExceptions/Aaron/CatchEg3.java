public class CatchEg3 {
	public void doSomething() throws AaronException{
		int i = 42;
		
		if(i > 30){
			throw new AaronException("An AARON occurred");
		}
		System.out.println("Doing something...");
	}
}

