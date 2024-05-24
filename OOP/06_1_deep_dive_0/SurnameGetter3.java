import java.util.Scanner;
public class SurnameGetter3{

	public String getSurname(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your surname");
		return kb.nextLine();
	}
}