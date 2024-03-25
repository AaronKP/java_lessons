public class BubbleSort{
	public static void main(String[] args) {
		
		int [] myArray = {2,4,5,1,7,8,3,9,6,0};
		//bubble sort
		System.out.println("Unsorted array");
		//print sorted array
		for (int a=0;a<myArray.length;a++ ) {
			System.out.print(myArray[a]+" ");
		}

		for (int i=0;i<myArray.length-1 ;i++ ) {
			for (int j=0;j<myArray.length-i-1 ;j++ ) {
				if (myArray[j]>myArray[j+1]) {
					int temp= myArray[j];
					myArray[j]=myArray[j+1];
					myArray[j+1]=temp;
				}
			}
		}

		//print sorted array
		System.out.println("\nSorted Array");
		for (int x=0;x<myArray.length;x++ ) {
			System.out.print(myArray[x]+" ");
		}

	}
}