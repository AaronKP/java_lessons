public class BufferTest1{
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Aaron");
		sb.insert(0,"Hi, my name is ");
		sb.insert(20,"Padiachy");
		System.out.println(sb.toString());
		sb.insert(20,' ');
		System.out.println(sb.toString());
	}
}