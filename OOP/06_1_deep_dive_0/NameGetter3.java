import java.util.Scanner;
public class NameGetter3{

	/**
	 * Returns the name Aaron
	 * @return name 
	 * */
	public String getName(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your name");
		return kb.nextLine();
	}
}