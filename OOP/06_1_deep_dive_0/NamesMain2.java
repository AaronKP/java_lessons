/**
 * A class that prints a custom greeting 
 * @version 2
 * @since 1
 * */
public class NamesMain2{
	public static void main(String[] args) {

		String name,surname;
		int age;
		NameGetter2 nameGetter = new NameGetter2();
		name=nameGetter.getName();
		SurnameGetter2 surnameGetter = new SurnameGetter2();
		surname=surnameGetter.getSurname();
		AgeGetter2 ageGetter = new AgeGetter2();
		age = ageGetter.getAge();

		System.out.println("Hello "+name+" "+surname);
		System.out.println("You are "+age+" years old");

	}
}