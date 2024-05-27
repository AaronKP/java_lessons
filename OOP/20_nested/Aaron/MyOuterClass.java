public class MyOuterClass{
	public MyOuterClass(){
		System.out.println("Constructing outer...");
	}

	public MyInnerClass createInnerObject(){
		return new MyInnerClass();
	}

	public class MyInnerClass{
		public MyInnerClass(){
			System.out.println("Constructing inner...");
		}
	}
}