/**
 * A class that prints a custom greeting 
 * @version 3
 * @since 1
 * */
public class NamesMain3{
	public static void main(String[] args) {

		String name,surname;
		int age;
		NameGetter3 nameGetter = new NameGetter3();
		name=nameGetter.getName();
		SurnameGetter3 surnameGetter = new SurnameGetter3();
		surname=surnameGetter.getSurname();
		AgeGetter3 ageGetter = new AgeGetter3();
		age = ageGetter.getAge();

		System.out.println("Hello "+name+" "+surname);
		System.out.println("You are "+age+" years old");

	}
}