import java.util.Scanner;
public class NationalityGetter{

	/**
	 * Returns the user's nationality
	 * @return nationality 
	 * */
	public String getNationality(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your nationality");
		return kb.nextLine();
	}
}