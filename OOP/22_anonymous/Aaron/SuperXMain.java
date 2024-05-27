public class SuperXMain {
	public static void main(String[] args) {

		SuperX superX = new SuperX(){
			@Override
			public void doSomething() {
				System.out.println("Doing something ...");
			}
		};
		
		superX.doSomething();
	}
}
