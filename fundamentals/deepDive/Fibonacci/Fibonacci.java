public class Fibonacci{
	public static void main(String[] args) {
		printFibonacci(10);//print fibonacci sequence for 10 terms
	}

	//method to print the Fibonacci sequence based on a input number of terms
	//next nr in Fibonacci sequence is the sum of the previous two terms
	public static void printFibonacci(int terms){
		int firstTerm=0, secondTerm=0, sum=0;
		for (int i =0;i<terms ;i++ ) {
			if (i==0) {
				firstTerm=0;//assign the first term as 0 
				System.out.print(firstTerm);
			}else if(i==1){
				secondTerm=1;//assign second term as 1
				System.out.print(secondTerm);
			}else{
				sum=firstTerm+secondTerm;//assign the next term in the squence to be the sum of the previous two terms
				System.out.print(sum);
				firstTerm=secondTerm;//shift the first term up a position . Now stores seconf term
				secondTerm=sum;//shift the second term up a position. Now stores sum
			}
			if(i<terms-1){
				System.out.print(", ");//output formatting 
			}
		}
	}
}