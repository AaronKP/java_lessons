public class MultiDimensionalString{
	public static void main(String[] args) {

		String line = "1,4,3,2,3,7,5,6,9\n" +"8,6,3,7,3,7,5,6,9\n";
		int[][] intArray= toIntArray2D(line);//pass string to be converted to 2D array
		printArray("\n2D array before sort",intArray);
		//sortAsc
		printArray("\n2D array after ascending sort",sortAsc(intArray));
		//sortDesc
		printArray("\n2D array after descending sort",sortDesc(intArray));
	}

	//method to convert a string into a multi dimensional array.
	public static int[][] toIntArray2D(String line){
		String[] arrays = line.split("\n");// split the string based on \n to get the different arrays within the 2d array
		String [] row;//this will store the array returned when we use split on "arrays" elements 
		int[][] intArray = new int[arrays.length][];//declare as jagged for convenience

		for (int i =0;i<arrays.length ;i++ ) {
			// assign array row with the array returned from the split method since "arrays" contains potential arrays at its indices
			row=arrays[i].split(",");
			intArray[i]= toIntArray1D(row);//convert the row array to its int form 
		}

		return intArray;
	}

	//method to convert a string with a "," delimeter into an int array
	public static int[] toIntArray1D(String[] stringArray){

		int [] intArray = new int [stringArray.length]; // store all string elements into this new int array

		try{
			for (int i =0;i<stringArray.length ;i++ ) {
				intArray[i]=Integer.parseInt(stringArray[i]);//convert string elements into int
			}
		}catch(Exception e){
			System.out.println("Invalid string. Cannot convert to type int");
		}
		
		return intArray;
	}

	//method to print 2D array
	public static void printArray(String prompt , int[][] array){
		System.out.println(prompt+"\n[");//output formatting 
		for (int i=0;i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				System.out.print(array[i][j]);
				if (j<array[i].length-1) {
					System.out.print(", ");//output formatting 
				}
			}
			System.out.println();
		}

		System.out.println("]");//output formatting 
	}

	//method to sort 2D array in ascending order
	public static int[][] sortAsc(int[][] array){
		for (int i =0;i<array.length ;i++ ) {//cycle through the rows of 2D array
			bubblesortAsc(array[i]);//pass in a row of the 2D array i.e. an array 
		}

		return array;
	}

	//method to sort array in ascending order
	public static void bubblesortAsc(int [] array){
		for (int i =0;i<array.length-1 ;i++ ) {
			for (int j=0;j<array.length-1-i ;j++ ) {//reduce number comparisons by i after every iteration
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

	//method to sort 2D array in ascending order
	public static int[][] sortDesc(int[][] array){
		for (int i =0;i<array.length ;i++ ) {//cycle through the rows of 2D array
			bubblesortDesc(array[i]);//pass in a row of the 2D array i.e. an array 
		}
		return array;
	}

	//method to sort array in Descending order
	public static void bubblesortDesc(int [] array){
		for (int i =0;i<array.length-1 ;i++ ) {
			for (int j=0;j<array.length-1-i ;j++ ) {//reduce number comparisons by i after every iteration
				if (array[j]<array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
}