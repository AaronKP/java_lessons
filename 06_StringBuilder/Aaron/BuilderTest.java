public class BuilderTest{
	public static void main(String[] args) {
		String hobby ="gaming";
		StringBuilder sb =  new StringBuilder("Aaron");
		sb.insert(0,"Hi, my name is ");
		sb.append(" Padiachy");
		sb.append(" I am ").append(25).append(" years old");
		System.out.println(sb);


	}
}