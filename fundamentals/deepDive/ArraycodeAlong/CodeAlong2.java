public class CodeAlong2{
	public static void main(String[] args) {
		//array declarations
		int [] myArray = new int[100];
		int [] destination = new int[17];
		//populate array with random nrs
		populateArray(myArray);
		System.out.println("\nOriginal array contents:");
		printArray(myArray);//print original array 
		System.out.println("\n\nArray copy contents:");
		System.arraycopy(myArray,15,destination,0,17);
		printArray(destination);//print copied elements from destination array
	}

	//method to populate array with random numbers
	public static void populateArray(int [] myArray){
		for (int i=0;i<myArray.length ;i++ ) {
			myArray[i] = (int)(Math.random()*100);//*100 and cast to int to get a whole number  
		}
	}

	//method to print array contents
	public static void printArray(int [] myArray){
		for (int i=0;i<myArray.length ;i++ ) {//iterate across array
			System.out.print(myArray[i]+" ");//print element at each index
		}
	}

}