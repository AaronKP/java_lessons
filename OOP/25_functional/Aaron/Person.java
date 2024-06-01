import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.Objects;
import java.time.temporal.ChronoUnit;

public class Person{

	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private LocalDate currentDate =LocalDate.now();
	private int age;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private ArrayList<Person> personList ;
	private int daysToNextBirthday;

	public Person(String name, String surname, String dob){
		this.name= name;
		this.surname=surname;
		dateOfBirth=LocalDate.parse(dob,formatter);
		age= currentDate.getYear()-dateOfBirth.getYear();
	}

	public Person(){

	}

	public String getDateOfBirth() {
        return dateOfBirth.toString();
    }

    public void setDateOfBirth(String dob) {
        this.dateOfBirth = LocalDate.parse(dob,formatter);;
        this.age = currentDate.getYear()-dateOfBirth.getYear();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode(){
    	return Objects.hash(age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age;
    }

    public void setListWithPeople(){
    	
    	personList= new ArrayList<Person>(Arrays.asList(
    		new Person ("Aaron","Padiachy","1998-12-22"),
    		new Person ("Goku","Son","2000-05-15"),
    		new Person ("Naruto","Uzamaki","1990-09-06"),
    		new Person ("Rick","Grimes","2002-10-10"),
    		new Person ("Boba","Fett","2006-11-01")
    	));
    }

    public void printList(){
    	System.out.println("List by age: ");

    	for (Person i: personList ) {
    		System.out.println(i.name+" "+ i.age+", \n");
    	}

    }

     public void printListSurname(){
    	System.out.println("Surname : ");

    	for (Person i: personList ) {
    		System.out.println(i.surname+" "+ i.age+", \n");
    	}

    }

    public void sortList(){
    	for (int i =0;i<personList.size()-1 ;i++ ) {
    		for (int j=0;j<personList.size()-1-i ;j++ ) {
    			if(personList.get(j).age>personList.get(j+1).age){
    				
    				Person temp = personList.get(j);
    				personList.set(j,personList.get(j+1));
    				personList.set(j+1,temp);
    				// personList.get(j)=personList.get(j+1);
    				// personList.get(j+1)=temp;

    			}
    		}
    		
    	}
    }

    public void sortList2(){
    	personList.sort((person1,person2)->person1.name.charAt(0)-person2.name.charAt(0));
    }

    public void sortList3(){
    	personList.sort((person1,person2)->person2.name.charAt(0)-person1.name.charAt(0));
    }

    public void sortList5(){
    	personList.sort((person1,person2)->person2.surname.charAt(0)-person1.surname.charAt(0));
    }

    public void sortList4(){
    	personList.sort((person1,person2)->person1.surname.charAt(0)-person2.surname.charAt(0));
    }

    public void setDaysToNextBirthday(){
    
    	personList.forEach(person->{
    		LocalDate nextBirthday= person.dateOfBirth.withYear(currentDate.getYear());// set birthday from dob to current year.
    		person.daysToNextBirthday= (int) ChronoUnit.DAYS.between(currentDate, nextBirthday);
    	});
    }

     public void printListDays2NextBday(){
    	System.out.println("Days to next birthday: : ");

    	for (Person i: personList ) {
    		System.out.println(i.name+" "+ i.daysToNextBirthday+", \n");
    	}

    }



}