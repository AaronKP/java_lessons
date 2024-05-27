public class Nested1Main {
	public static void main(String[] args) {
		Nested1 outer = new Nested1();
		Nested1.Inner inner = outer.new Inner();
	}
}
