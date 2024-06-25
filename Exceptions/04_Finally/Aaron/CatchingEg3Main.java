public class CatchingEg3Main {
	public static void main(String[] args) {
		try{
			CatchEg3 myObject = new CatchEg3();
			myObject.doSomething();
		}
		catch(Exception e){
			System.out.println("Error from doSomething()");
		}
		finally{
			System.out.println("Finished");	
		}
	}
}

