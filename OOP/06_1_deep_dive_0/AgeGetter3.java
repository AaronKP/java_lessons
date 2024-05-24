import java.util.Scanner;
public class AgeGetter3{
	public int getAge(){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your Age");
		return Integer.parseInt(kb.nextLine());
	}
}
		