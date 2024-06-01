public class NewMain{
	public static void main(String[] args) {
		NewInterface1 newInterface = (number)->++number;
		System.out.println("Increment interface: "+newInterface.increment(2));

		AddInterface ni1 = (num1,num2)->num1+num2;
		System.out.println("\nAdd Interface: "+ni1.add(10,12));


	}
}