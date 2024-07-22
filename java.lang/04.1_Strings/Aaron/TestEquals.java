public class TestEquals{
	public static void main(String[] args) {
		String x = "Aaron";
		String z ="Aaron";
		String y = new String("Aaron");
		System.out.println(x.equals(z));//true
		System.out.println(z.equals(y));//true
		System.out.println(z==y);//false
		Character a=48;
		Character b =48;
		System.out.println(a==b);//true
		Double d = 10.5;
		Double db = 10.5;
		System.out.println(d==db);//false
		String st = "aaron";
		System.out.println(x.equalsIgnoreCase(st));//true
		System.out.println(st.length());//5
		System.out.println(st.substring(0,2));//aa

	}
}