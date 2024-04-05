public class SingleDimensionString{
	public static void main(String[] args) {
		//String to be converted into an int[]
		String line="1,4,3,2,3,7,5,6,9";
		int [] intArray = toIntArray(line);//convert string to int array
		printArray("\nInteger Array before sort: ",intArray);//print int array before sort
		sortAsc(intArray);
		printArray("\nInteger Array after ascending sort: ",intArray);//print int array after ascending sort
		sortDesc(intArray);
		printArray("\nInteger Array after descending sort: ",intArray);//print int array after descending sort
	}

	//method to convert a string with a "," delimeter into an int array
	public static int[] toIntArray(String line){

		String [] stringArray = line.split(",");//convert String into a string array based on delimeter
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

	//method to sort array in ascending order
	public static void sortAsc(int [] array){
		for (int i =0;i<array.length-1 ;i++ ) {
			for (int j=0;j<array.length-1-i ;j++ ) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

	//method to sort array in Descending order
	public static void sortDesc(int [] array){
		for (int i =0;i<array.length-1 ;i++ ) {
			for (int j=0;j<array.length-1-i ;j++ ) {
				if (array[j]<array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

	//method to print array contents
	public static void printArray (String prompt, int[] array){
		System.out.print(prompt+" [");
		for (int i =0;i<array.length ;i++ ) {
			System.out.print(array[i]);
			if (i<array.length-1) {
				System.out.print(", ");//output formatting between elements 
			}
		}
		System.out.println("]\n");
	}
}