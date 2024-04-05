public class ArrayManipulation7 {
    public static void main(String[]args){
        int[] array = {3,4,2,6,4,7,9,1,0};

        printArray("array before trim ",array);

        //This trim will work       
        array = trim(array);

        printArray("array after trim ",array);



    }
    
    //method that will resize an array with unpopulated elements
    public static int [] trim(int[] array){

        //First lets just iterate through the array
        //If we find a slot with a zero we use it and return
        //If this is the case then we do not resize all is good.
        //asuming 0 indicates an empty spot 
        int[] newArray;
        int newSize=0;// counter variable to determine new size of reduced array
        for (int i =0;i<array.length ;i++ ) {
            if (array[i]!=0) {
                newSize++;//count populated elements
            }
            
        }
        newArray = new int[newSize];

        //populate newly initialized array with elements from original array
        for (int j=0;j<newArray.length ;j++ ) {
            newArray[j]=array[j];
        }//change

        return newArray;
        
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
