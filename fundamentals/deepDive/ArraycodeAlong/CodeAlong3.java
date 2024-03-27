public class CodeAlong3{

	//array declarations
	private static int[][] my2DArray = new int [10][10];
	private static int[] rowArray = new int[10];
	private static int[] colArray = new int[10];
	private static String errorMessage="";//custom error message
	private static int row;//stores the row the user wishes to retrieve
	private static int col;//stores the col the user wishes to retrieve

	public static void main(String[] args) {
		populate2D(my2DArray);
		System.out.println("\nOriginal 2D array\n*******************************");
		//print the 2D array and specify row index for the row to be retrieved 
		print2D(my2DArray,setRow(9));//set row specifies the index of the row we want to retrieve from the 2D array

		colArray=getCol(setCol(11));//retrieve the column at the specified index

		if(errorMessage.equals("Entered row is out of bounds")||errorMessage.equals("Entered col is out of bounds")){
		//of the error message has been set it means that the index entered is out of bounds
			System.out.println("\n"+errorMessage+"\nNO DATA TO DISPLAY\n*******************************");
		}else{//otherwise display the  row if index is within bounds
			System.out.println("\nArray at row("+row+") retrieved\n*******************************");
			printArray1D(rowArray);
			System.out.println("\nArray at col("+col+") retrieved\n*******************************");
			printArray1D(colArray);

		}
	}

	//method to populate 2D array
	public static void populate2D(int [][] my2DArray){
		for (int i =0;i<my2DArray.length ;i++ ) {//iterate across array row and cols
			for(int j=0;j<my2DArray[i].length;j++){
				my2DArray[i][j]=(int)(Math.random()*100);//*100 and cast to int to get a whole number  
			}
		}
	}

	//method to print the 2D.
	public static void print2D(int[][] my2DArray, int row){
		//print 2D array
		for (int i=0;i<my2DArray.length ;i++ ) {
			for (int j=0;j<my2DArray[i].length ;j++ ) {
				System.out.print(my2DArray[i][j]+" ");
			}
			System.out.println();//output formatting

			if((row-1)==i){//check whether the index of an array matches the user's requested index
				rowArray=getRow(i);//return the row at the specified index if the index is within bounds
			}else if((row-1)<0 || (row-1)>my2DArray.length){//otherwise set the error message 
				errorMessage="Entered row is out of bounds";
			}
		}
	}

	//method to set and return the row  that the user wants to retrieve
	public static int setRow(int userRow){
		row=userRow;
		return row;// 
	}

	//method to set and return the col  that the user wants to retrieve
	public static int setCol(int userCol){
		col=userCol;
		return col;// 
	}

	//method to return a specified array row
	public static int[] getRow(int rowIndex){
		  return my2DArray[rowIndex];
	}

	//print 1D / row array
	public static void printArray1D(int[] rowArray){
		for (int i=0;i<rowArray.length ;i++ ) {//iterate through array.
			System.out.print(rowArray[i]+ " ");
		}
	} 

	//method to return the col of a 2D array at a specified index
	public static int[] getCol(int col){
		int[] column = new int [10];
		for (int i=0;i<my2DArray.length ;i++ ) {
			for (int j=0;j<my2DArray[i].length ;j++ ) {
				if ((col-1)==j) {
					column[i]=my2DArray[i][j];
				}else if((col-1)<0||(col-1)>my2DArray[i].length-1){
					errorMessage="Entered col is out of bounds";
				}
			}
		}
		return column;
	}


}