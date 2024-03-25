import java.util.Random;// imported to generate random numbers to populate array

public class OneDArrayQ4toQ6{
	public static void main(String[] args) {

		final int SIZE=50;
		//empty array size 50
		int [] myArray = new int[SIZE];
		//populate empty array
		populateArrayRandom(myArray);

		//printArray method call
		System.out.println("Original Elements:");
		printArray(myArray);
		//print original elements that are even and elements that are divisible by 11
		System.out.println("\nOriginal elements that are even and elements that are divisible by 11:");
		printEvenAndDivisibleBy11(myArray);
		//increment array elements
		incrementElementsByOne(myArray);
		//print incremented array elements
		System.out.println("\nIncremented elements:");
		printArray(myArray);
		System.out.println("\nIncremented elements that are even and elements that are divisible by 11:");
		//print incremented elements that are even and elements that are divisible by 11
		printEvenAndDivisibleBy11(myArray);		
	}

	//method to populate array with random integers 
	public static void populateArrayRandom(int [] myArray){
		Random random = new Random();
		int i=0;
		while(i<myArray.length){
			myArray[i]= random.nextInt(50);
			i++;
		}
		// for (int i=0;i<myArray.length ;i++ ) {
		// 	myArray[i]= random.nextInt(50);
		// }
	}
	//method to print array
	public static void printArray(int [] myArray){

		int i=0;
		while(i<myArray.length){
			System.out.print(myArray[i]+" ");
			i++;
		}
		// for (int i=0;i<myArray.length ;i++ ) {
		// 	System.out.print(myArray[i]+" ");
		// }
	}

	public static void incrementElementsByOne(int [] myArray){
		int i=0;
		while(i<myArray.length){
			myArray[i]=myArray[i]+1;//increment each element by 1
			i++;
		}
		// for (int i=0;i<myArray.length ;i++ ) {
		// 	myArray[i]=myArray[i]+1;//increment each element by 1
		// }
	}

	public static void printEvenAndDivisibleBy11(int [] myArray){
		int i=0;
		while(i<myArray.length){
			switch(myArray[i]%2){
			case 0:
				switch(myArray[i]%11){
				case 0: 
					System.out.print(myArray[i]+" ");
					break;
				default:
					break;
				}
				break;
			default:
				
			}
			i++;
		}

		// for (int i=0;i<myArray.length ;i++ ) {
		// 	if (myArray[i]%2==0 && myArray[i]%11==0) {
		// 		System.out.print(myArray[i]+" ");
		// 	}
			
		// }
	}

}