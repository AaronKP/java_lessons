/**
 * A class that prints a custom greeting 
 * @version 1
 * @since 1
 * */
public class NamesMain1{
	public static void main(String[] args) {

		String name,surname;
		int age;
		NameGetter1 nameGetter = new NameGetter1();
		name=nameGetter.getName();
		SurnameGetter1 surnameGetter = new SurnameGetter1();
		surname=surnameGetter.getSurname();
		AgeGetter1 ageGetter = new AgeGetter1();
		age = ageGetter.getAge();

		System.out.println("Hello "+name+" "+surname);
		System.out.println("You are "+age+" years old");

	}
}