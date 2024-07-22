public class StringTest2 {
	public static void main(String[] args) {
		String name1 = new String("Hello");
		String name2 = new String("Hello");
		
		if(name1.equals(name2)){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
	}
}
