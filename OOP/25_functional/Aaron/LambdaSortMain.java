public class LambdaSortMain{
	public static void main(String[] args) {
		Person person = new Person();
		person.setListWithPeople();
		person.sortList4();
		person.printListSurname();
		person.setDaysToNextBirthday();
		person.printListDays2NextBday();
	}
}