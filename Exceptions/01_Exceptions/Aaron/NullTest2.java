public class NullTest2 {

	static NullObject nullObject= new NullObject();
	
	public static void main(String[] args) {
		System.out.println("Start");
		try{
			throw new AaronException();
		}
		catch(AaronException e){
			System.out.println(e.getMessage());

		}
		System.out.println("Finished");
	}

}
