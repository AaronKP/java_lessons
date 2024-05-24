import java.util.Scanner;
public class HeightGetter{

	/**
	 * Returns the height of user
	 * @return height 
	 * */
	public int getHeight(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your height (cm)");
		return Integer.parseInt(kb.nextLine());
	}
}