public class ArrayManipulation8 {
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
       
        printArray("\narrayA before merging ",arrayA);
        merge( arrayA, arrayB);
        printArray("\narrayB before merging ",arrayB);

        //print merged array contents
        printArray("\nMerged array contents ",merge(arrayA,arrayB));

        //print sorted merged array
        printArray("\nSorted Merged array contents -Ascending order ",sortAsc(merge(arrayA,arrayB)));

        //print sorted merged array
        printArray("\nSorted Merged array contents -Descending order ",sortDesc(merge(arrayA,arrayB)));
    }

    public static int [] merge(int[] arrayA,int[] arrayB){
        
        int mergedSize= arrayA.length + arrayB.length;//find size of merged array
        int[] mergedArray= new int[mergedSize];//declared merged array
        int index2=0; // used as a counter for iteratring through the second array 

        for (int i =0;i<mergedArray.length ;i++ ) {
            if (i<arrayA.length) {
                mergedArray[i]=arrayA[i];
            }else{
                mergedArray[i]=arrayB[index2];
                index2++;
            }
        }

        return mergedArray;
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
}
