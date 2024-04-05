public class FizzBuzz{
	public static void main(String[] args) {
		fizzBuzz();
	}

	public static void fizzBuzz(){
		for (int i=1;i<=100 ;i++ ) {//for loop used to print values 1 to 100
			if (i%3==0 && i%5==0) {//first check if multiples of both to prevent logical errors
				System.out.print("FizzBuzz");
			}else if(i%3==0){
				System.out.print("Fizz");
			}
			else if(i%5==0){
				System.out.print("Buzz");
			}else{
				System.out.print(i);//print i if not a multiple of either 3 or 5
			}

			//output formatting
			if(i<100){
				System.out.print(", ");
			}
		}
	}
}