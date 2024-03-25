public class QuickSort{
	public static void main(String[] args) {
		
		int [] myArray = {2,4,5,1,7,8,3,9,6,0};
		int startIndex=0;
		int endIndex = myArray.length-1;

		//print sorted array
		System.out.println("Unsorted array");
		printArray(myArray);
		
		//Quicksort algorithm 
		quickSort(myArray,startIndex,endIndex);

		//print sorted array
		System.out.println("\nSorted Array");
		printArray(myArray);
	}

	public static void printArray(int [] myArray){
		for (int a=0;a<myArray.length;a++ ) {
			System.out.print(myArray[a]+" ");
		}
	}

	//3 params : array, index 0, index of array end 
		/*
		smaller elements to left of pivot
		Recursively divide array into partitions and pass them as args recusrively into quickSort
		O(nlogn) complexity*/
	public static void quickSort(int [] myArray,int startIndex, int endIndex){
		if(endIndex<=startIndex) return;//base case. 
		//Eventually you can't divide/partition array any further

		//find pivot using the partition function
		int pivotIndex = partition(myArray,startIndex,endIndex);

		//once pivot is located, pass each partition recursively into quickSort method
		quickSort(myArray, startIndex, pivotIndex-1);//left partition
		quickSort(myArray, pivotIndex+1, endIndex);//right partition. start index is pivot index +1
	}

	//helper function that locates and returns the index of the pivot
	public static int partition(int [] myArray,int startIndex, int endIndex){

		int pivotValue=myArray[endIndex];//pivot value used to compare against elements in the array
		int i=startIndex-1;// will eventually represent pivot's index
		
		for (int j =startIndex;j<=endIndex ;j++ ) {//<= because we said endIndex = myArray.length -1. 
			if (myArray[j]<pivotValue) {//values less than pivot must be on LHS
				i++;
				int temp=myArray[i];
				myArray[i]=myArray[j];
				myArray[j]=temp;
			}
		}

		//once all elements> that pivot are on right and elements<pivot are on left : i++ and swap with pivot 
		i++;
		//then insert pivot in middle of the partitions where i is located 
		int temp=myArray[i];
		myArray[i]=myArray[endIndex];
		myArray[endIndex]=temp;

		return i;// i now represents the location of the pivot after the swap
	}
}