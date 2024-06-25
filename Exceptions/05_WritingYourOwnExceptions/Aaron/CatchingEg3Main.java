public class CatchingEg3Main {
	public static void main(String[] args) {
		try{
			CatchEg3 myObject = new CatchEg3();
			myObject.doSomething();
		}
		catch(AaronException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Finished");	
		}
	}
}

