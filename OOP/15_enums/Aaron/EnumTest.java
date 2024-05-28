public class EnumTest {
	public static void main(String[] args) {
		Continents continent1 = Continents.AUSTRALIA;
		Continents continent2 = Continents.AFRICA;
		 
		boolean res1 = continent1.equals(continent2);
		 
		System.out.println(continent1+" equals "+continent2+" is "+res1);
 
	}
 
}
