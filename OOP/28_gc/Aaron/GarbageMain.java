public class GarbageMain{
	public static void main(String[] args) {
		Garbage gc1 = new Garbage("Garbage1");
		Garbage gc2 = new Garbage("Garbage2");
		Garbage gc3 = new Garbage("Garbage3");
		Garbage gc4 = new Garbage("Garbage4");
		Garbage gc5 = new Garbage("Garbage5");

		System.gc();

		Garbage gc6 = new Garbage("Garbage1");
		Garbage gc7 = new Garbage("Garbage2");
		Garbage gc8 = new Garbage("Garbage3");
		Garbage gc9 = new Garbage("Garbage4");
		Garbage gc10 = new Garbage("Garbage5");

		System.gc();
	}
}