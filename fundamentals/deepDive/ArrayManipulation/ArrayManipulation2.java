import java.util.Scanner;

public class ArrayManipulation2 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1};

        printArray("\narray before swapping ",array);
               
        //swap /reverse the order of array elements
        //reverseArray(array);
        //printArray("array after swapping ",sortAsc(array));

        //sort in ascending order.
        //quicksort(array,0,array.length-1);
         printArray("\narray after ascending sort ",sortAsc(array));
         printArray("\narray after descending sort ",sortDesc(array));

         //remove elements from array.
         printArray("\nAltered array with removed elements", removeElements(array));
        
    }
    
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }

            
        }
        System.out.print("]\n");
    }

    //method to reverse the order of array elements
    public static void reverseArray(int[] array){
        for (int i=0;i<array.length/2;i++ ) {//divide by to so as to not undo swap
            int temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]= temp;
            
        }
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

    //method to Remove contents from an array from a start index to end index and return a new array with the remaining contents
    public static int[] removeElements(int[] array){
        //declare scanner object to gather user input.
        Scanner kb = new Scanner(System.in);
        //local variables to store user input. Counter used to track array size
        int startIndex,endIndex,counter=0; 
        //flag variable for validation of input.
        boolean isValidIndex=false;
        //array to store reduced array
        int[] newArray;
        while(isValidIndex==false){
            try{
                System.out.println("\nEnter start index to remove element from:");
                startIndex=Integer.parseInt(kb.nextLine());
                System.out.println("\nEnter end index for end point of removal");
                endIndex=Integer.parseInt(kb.nextLine());
                for (int i =startIndex;i<=endIndex ;i++ ) {
                    array[i]=-1;
                }
                isValidIndex=true;
            }catch(Exception e){
                System.out.println("\n*******************\nIndex entered is invalid\n*******************");
                isValidIndex=false;
            }
        }

        //record the nr of elements that are not -1 and use this to set the size of new array
        for (int i=0;i<array.length ;i++ ) {
            if (array[i]!=-1) {
                counter++;
            }
        }
        newArray= new int[counter];// set newArray size

        //populate new array 
        int newArrayIndex=0;// to ensure there are no zero values in the new array set diffwerent counter to i
        for (int i=0;i<array.length ;i++ ) {
            
            if (array[i]!=-1) {
                newArray[newArrayIndex]=array[i];//store all values that are not -1
                newArrayIndex++;
            }
        }
        
        return newArray;

    }

    public static void quicksort(int[] array, int startIndex, int endIndex){
        if(endIndex<=startIndex) return;
        int pivotIndex=partition(array,startIndex,endIndex);
        quicksort(array,startIndex,pivotIndex-1);
        quicksort(array,pivotIndex+1,endIndex);

    }

    public static int partition(int[] array, int startIndex, int endIndex){
        int pivotValue = array[endIndex];
        int i = startIndex-1;

        for (int j=startIndex;j<endIndex ;j++ ) {
            if(array[j]<array[endIndex]){
                i++;
                int temp = array[i];
                array[i] =array[j];
                array[j]=temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] =array[endIndex];
        array[endIndex]=temp;

        return i;

    }
}
