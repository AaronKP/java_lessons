public class Garbage{
	private String name;

	public String getName(){
		return name;
	}

	public Garbage(String paramName){
		name=paramName;
	}

	@Override
	protected void finalize(){
		System.out.println("Finalizing before garbage collection");
	}
}