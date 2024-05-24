import java.util.Scanner;
public class HobbyGetter{

	/**
	 * Returns the user's hobby
	 * @return hobby 
	 * */
	public String getHobby(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a hobby ");
		return kb.nextLine();
	}
}