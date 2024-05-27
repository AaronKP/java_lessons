public class NestedExample1Main {
	public static void main(String[] args) {
		NestedExample1 outerInstance = new NestedExample1();
		
		NestedExample1.Inner createInner = outerInstance.createInner();
		
	}
}
