import java.util.Random;

public class RandomQuicksort{

	public static void main(String [] args){
		
		int [] myArray = new int[10];
		int startIndex = 0;
		int endIndex = myArray.length-1;
		
		populateArrayRnd(myArray);

		System.out.println("Unsorted Array");
		displayArray(myArray);

		quicksort(myArray,startIndex,endIndex);
		
		System.out.println("\nSorted Array using quick sort");
		displayArray(myArray);
	}

	public static void populateArrayRnd(int [] myArray){
		Random random= new Random();
		for(int i =0; i<myArray.length;i++){
			myArray[i]=random.nextInt(100);
		}
	}
	
	public static void displayArray(int [] myArray){
		for(int element : myArray){
			System.out.print(element+" ");
		}
	}

	public static void quicksort(int [] myArray, int startIndex, int endIndex){

		if(endIndex<=startIndex) return;
		
		int pivotIndex= partition(myArray,startIndex,endIndex);

		quicksort(myArray,startIndex, pivotIndex-1);
		quicksort(myArray, pivotIndex+1,endIndex);
	}

	public static int partition(int [] myArray, int startIndex, int endIndex){
		
		int pivotValue = myArray[endIndex];
		int i = startIndex -1;
		
		for(int j=startIndex;j<=endIndex;j++){
			if(myArray[j]<pivotValue){
				i++;
				int temp = myArray[i];
				myArray[i]=myArray[j];
				myArray[j]=temp;
			}
		}
		i++;
		int temp = myArray[i];
		myArray[i]=myArray[endIndex];
		myArray[endIndex]=temp;

		return i;
	}
}