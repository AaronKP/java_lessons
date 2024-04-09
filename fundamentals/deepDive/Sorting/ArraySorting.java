public class ArraySorting{
	public static void main(String[] args) {
		int[] myArray= new int[50];//array declaration

		//alter array size
		myArray=alterArraySize(myArray);
		//populate array
		populateArray(myArray);
		printArray("\nOriginal populated array:\n", myArray);
		printArray("\nAltered array at position 20:\n", alterElementAt(myArray,20,60));//add 60 to 20th element
		printArray("\nAltered array at position 61:\n", alterElementAt(myArray,61,61));//add 61 to 21st element
		//printArray("\nSorted descending array:\n", sortDesc(myArray));
		//print in decending order
		printArray("\nSorted descending array:\n", bubblesortDesc(myArray));
		//print elements in ascending order 
		printArray("\nSorted Ascending array:\n", sortAsc(myArray));


	}

	//method to alter array size
	public static int []  alterArraySize(int [] array){
		int newSize=array.length+50;//increase size by 50
		int [] newArray= new int[newSize];//declare new array with new size

		return newArray;
	}

	//method to populate array with random nrs
	public static void populateArray(int[] array){
		for (int i=0;i<array.length ;i++ ) {
			array[i]=(int)(Math.random()*100);//* 100 to prevent all 0 elements when cast occurs
		}
	}

	//method to print array
	 public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");//output formatting 
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");//output formatting 
            }

            
        }
        System.out.print("]\n");//output formatting 
    }

    //method to change a specific element at a certain index
    public static int[] alterElementAt(int[] array, int position, int valueToAdd){
    	try{
    		array[position-1]+=valueToAdd;//add specified amount to element located at the index position-1
    	}catch(Exception e){
    		System.out.println("Invalid input");
    	}

    	return array;
    }

    //method to sort array descending
    public static int [] sortDesc(int[] array){
        boolean swappedElement= true;//flag variable set to true to run loop
        while(swappedElement){
            swappedElement=false;//initialize to false, set to true only when there is a swap to make otherwise keep checking array for swaps
            for (int i =0;i<array.length-1 ;i++ ) {
                if (array[i]<array[i+1]) {
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    swappedElement=true;
                }
            }
            
        }

        return array;
    }

    //method to sort array contents ascending 
    public static int [] bubblesortDesc(int [] array){
        for (int i=0;i<array.length-1 ;i++ ) {// array.length-1 becuase we are making adjacent comparisons. array.length is not an index
            for (int j=0;j<array.length-1-i ;j++ ) {//array.length-1-i to reduce the nr of comparisons because after each iteration the last element is in the correct place
                if (array[j]<array[j+1]) {
                    int temp=array[j];//temp to allow for swapping
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    //method to sort array contents ascending 
    public static int [] sortAsc(int [] array){
        for (int i=0;i<array.length-1 ;i++ ) {// array.length-1 becuase we are making adjacent comparisons. array.length is not an index
            for (int j=0;j<array.length-1-i ;j++ ) {//array.length-1-i to reduce the nr of comparisons because after each iteration the last element is in the correct place
                if (array[j]>array[j+1]) {
                    int temp=array[j];//temp to allow for swapping
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}