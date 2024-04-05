public class ArrayManipulation9 {//remove elements in a that are found in b and return a that is a smaller size.
    public static void main(String[]args){
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};

        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);

        arrayA = sub( arrayA, arrayB);
        printArray("arrayA after subtracting ",arrayA);       
        printArray("arrayB after subtracting ",arrayB);
    }

    public static int [] sub(int[] arrayA,int[] arrayB){
       int[] newArrayA;//new subtracted array that will be returned
       int counter=0;//used to determine the size of the new Array
       int newArrayIndex=0;//will be incremented to populate the new array as we iterate over arrayA. Prevents default values in new array

       //for loops to find and remove elements in A that are also found in B
       for (int a=0;a<arrayA.length ;a++ ) {//iterates through arrayA's elements
           for (int b=0;b<arrayB.length ;b++ ) {//iterate through arrayB's elements 

               if (arrayA[a]==arrayB[b]) {//if duplicate found 
                   arrayA[a]=-1; //-1 represents a removed element
                   counter++;//increment counter to find the number of elements that are removed. newArrayA size is the length of A - counter
               }
           }
       }

       newArrayA=new int[arrayA.length-counter];// initialize new Array 

       //populate new array
       for (int k =0;k<arrayA.length ;k++ ) {//cycle through arrayA
           if (arrayA[k]!=-1) {
               newArrayA[newArrayIndex]=arrayA[k];//assign non -1 elements into newArray
               newArrayIndex++;// increment to pass through newArray elements
           }
       }

        return newArrayA;//return newly populated array
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
