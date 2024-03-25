import java.util.Random;// imported to generate random numbers to populate array

public class MultiDArrayQ10toQ12{
	public static void main(String[] args) {
		//empty 2D array
		int [][] myArray= new int[100][30];
		populateArrayRandom(myArray);
		//print original array
		System.out.println("\nOriginal array");
		printArray(myArray);
		//print original elements that are even and elements that are divisible by 11
		System.out.println("\nOriginal elements that are odd OR that are divisible by 8:");
		printOddAndDivisibleBy8(myArray);
		//print incremented array
		System.out.println("\nIncremented array");
		incrementByOne(myArray);
		printArray(myArray);
		System.out.println("\nIncremented elements that are odd OR that are divisible by 8:");
		//print incremented elements that are even and elements that are divisible by 11
		printOddAndDivisibleBy8(myArray);	
	}

	//method to populate array with random integers
	public static void populateArrayRandom(int [][] myArray){
		Random random = new Random();
		int i=0;
		while(i<myArray.length){
			int j=0;
			while(j<myArray[i].length){
				myArray[i][j]=random.nextInt(100);
				j++;
			}
			i++;
		}

		// for(int i =0;i<myArray.length;i++){
		// 	for(int j=0;j<myArray[i].length;j++){
		// 		myArray[i][j]=random.nextInt(100);//assign random integer value between 0 and 100
		// 	}
		// }
	}

	//increment each element by 1
	public static void incrementByOne(int [][] myArray){

		int i=0;
		while(i<myArray.length){
			int j=0;
			while(j<myArray[i].length){
				myArray[i][j]=myArray[i][j]+1;
				j++;
			}
			i++;
		}

		// for(int i =0;i<myArray.length;i++){
		// 	for(int j=0;j<myArray[i].length;j++){
		// 		myArray[i][j]=myArray[i][j]+1;//Increment each element in the 2D array by 1
		// 	}
		// }
	}

	//print array
	public static void printArray(int [][] myArray){
		
		int i=0;
		while(i<myArray.length){
			int j=0;
			while(j<myArray[i].length){
				System.out.print(myArray[i][j]+ " ");
				j++;
			}
			System.out.println();
			i++;
		}

		// for(int i =0;i<myArray.length;i++){
		// 	for(int j=0;j<myArray[i].length;j++){//cycle through array elements
		// 		System.out.print(myArray[i][j]+ " ");
		// 	}
		// 	System.out.println();
		// }
	}

	//print element if even or divisible by 8
	public static void printOddAndDivisibleBy8(int [][] myArray){
		
		int i=0;
		while(i<myArray.length){
			int j=0;
			while(j<myArray[i].length){

				switch(myArray[i][j]%2){
				case 0: 
					switch(myArray[i][j]%8){//all multiples of 8 are even
					case 0:
						System.out.print(myArray[i][j]+ " ");//print element 
						break;
					default:
						break;
					}
					break;
				default:
					System.out.print(myArray[i][j]+ " ");//print odd element 
					
				}
				j++;
			}
			System.out.println();
			i++;
		}

		for(int i =0;i<myArray.length;i++){
			for(int j=0;j<myArray[i].length;j++){//cycle through array elements

				if(myArray[i][j]%2!=0||myArray[i][j]%8==0){//if even or divisible by 11 
					System.out.print(myArray[i][j]+ " ");//print element 
				}
				
			}
			System.out.println();
		}
	}
}