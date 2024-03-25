public class OneDArrayQ1toQ3{
	public static void main(String[] args) {
		//pre populated array size 50
		int [] myArray = {
			1,2,3,4,5,6,7,8,9,10,
			11,12,13,14,15,16,17,18,19,20,
			21,22,23,24,25,26,27,28,29,30,
			31,32,33,34,35,36,37,38,39,40,
			41,42,43,44,45,46,47,48,49,50
		};

		//printArray method call
		System.out.println("Original Elements:");
		printArray(myArray);
		//print original elements that are even and elements that are divisible by 11
		System.out.println("\nOriginal elements that are even AND that are divisible by 11:");
		printEvenAndDivisibleBy11(myArray);
		//increment array elements
		incrementElementsByOne(myArray);
		//print incremented array elements
		System.out.println("\nIncremented elements:");
		printArray(myArray);
		System.out.println("\nIncremented elements that are even AND elements that are divisible by 11:");
		//print incremented elements that are even and elements that are divisible by 11
		printEvenAndDivisibleBy11(myArray);		
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