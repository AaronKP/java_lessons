public class ArrayManipulation1 {
    public static void main(String[]args){
        int[] array = new int[10];
       
        //Populate array with random numbers
        
        printArray("array with random numbers ",array);

        //Add a for loop in the indicated position that we clear the array by setting all the values to 0.


        printArray("array with zeros ",array);

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
