public class MultiDArrayQ7toQ9{
	public static void main(String[] args) {
		//pre populated 2D array
		int [][] myArray= {
			{1,2,3,4,5,6,7,8,9,10},
			{11,12,13,14,15,16,17,19,20,21},
			{22,23,24,25,26,27,29,30,31,32},
			{33,34,35,36,37,38,39,40,41,42},
			{43,44,45,46,47,48,49,50,51,52},
			{53,54,55,56,57,58,59,60,61,62},
			{63,64,65,66,67,68,69,70,71,72},
			{73,74,75,76,77,78,79,80,81,82}
		};
		//print original array
		System.out.println("\nOriginal array");
		printArray(myArray);
		//print original elements that are even and  that are divisible by 11
		System.out.println("\nOriginal elements that are even AND are divisible by 11:");
		printEvenAndDivisibleBy11(myArray);
		//print incremented array
		System.out.println("\nIncremented array");
		incrementByOne(myArray);
		printArray(myArray);
		System.out.println("\nIncremented elements that are even AND are divisible by 11:");
		//print incremented elements that are even and  that are divisible by 11
		printEvenAndDivisibleBy11(myArray);	
	}

	//increment each element by 1
	public static void incrementByOne(int [][] myArray){

		// int i=0;
		// while(i<myArray.length){
		// 	int j=0;
		// 	while(j<myArray[i].length){
		// 		myArray[i][j]=myArray[i][j]+1;
		// 		j++;
		// 	}
		// 	i++;
		// }

		for(int i =0;i<myArray.length;i++){
			for(int j=0;j<myArray[i].length;j++){
				myArray[i][j]=myArray[i][j]+1;//Increment each element in the 2D array by 1
			}
		}
	}

	//print array
	public static void printArray(int [][] myArray){
		
		// int i=0;
		// while(i<myArray.length){
		// 	int j=0;
		// 	while(j<myArray[i].length){
		// 		System.out.print(myArray[i][j]+ " ");
		// 		j++;
		// 	}
		// 	System.out.println();
		// 	i++;
		// }

		for(int i =0;i<myArray.length;i++){
			for(int j=0;j<myArray[i].length;j++){//cycle through array elements
				System.out.print(myArray[i][j]+ " ");
			}
			System.out.println();
		}
	}

	//print element if even or divisible by 11
	public static void printEvenAndDivisibleBy11(int [][] myArray){
		
		// int i=0;
		// while(i<myArray.length){
		// 	int j=0;
		// 	while(j<myArray[i].length){

		// 		switch(myArray[i][j]%2){
		// 		case 0: 
		// 			switch(myArray[i][j]%11){
		// 			case 0:
		// 				System.out.print(myArray[i][j]+ " ");//print element if both conditions are true
		// 				break;
		// 			default:
		// 				break;
		// 			}
		// 			break;
		// 		default:
		// 			break;
		// 		}
		// 		j++;
		// 	}
		// 	System.out.println();
		// 	i++;
		// }

		for(int i =0;i<myArray.length;i++){
			for(int j=0;j<myArray[i].length;j++){//cycle through array elements

				if(myArray[i][j]%2==0&&myArray[i][j]%11==0){//if even and divisible by 11 
					System.out.print(myArray[i][j]+ " ");//print element 
				}
				
			}
			System.out.println();
		}
	}
}