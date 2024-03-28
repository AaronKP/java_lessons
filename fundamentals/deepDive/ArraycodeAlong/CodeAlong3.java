import java.util.Scanner;
public class CodeAlong3{

	//array declarations
	private static int[][] my2DArray = new int [10][10];
	private static int[] rowArray = new int[10];
	private static int[] colArray = new int[10];
	private static int[] cellArray= new int[2];
	private static String errorMessageRow="";//custom error message
	private static String errorMessageCol="";//custom error message
	private static int row;//stores the row the user wishes to retrieve
	private static int col;//stores the col the user wishes to retrieve

	public static void main(String[] args) {

		boolean proceed=true;
		Scanner in = new Scanner(System.in);
		//populate 2D array with random nrs
		populate2D(my2DArray);

		while(proceed){
			//print menu
			switch(printMenu()){
			case 1:
				//print the 2D array and specify row index for the row to be retrieved 
				print2D(my2DArray,setRow(promptRow()));//set row specifies the index of the row we want to retrieve from the 2D array
				//code to determine the output displayed
				if(errorMessageRow.equals("Entered row is out of bounds")){
				//of the error message has been set it means that the index entered is out of bounds
					System.out.println("\n"+errorMessageRow+"\nNO DATA TO DISPLAY\n*******************************");
				}else{//otherwise display the  row if index is within bounds
					System.out.println("\nArray at row("+row+") retrieved\n*******************************");
					printArray1D(rowArray);
				}
				break;
			case 2:
				colArray=getCol(setCol(promptColumn()));//retrieve the column at the specified index
				if(errorMessageCol.equals("Entered col is out of bounds")){
					System.out.println("\n\n"+errorMessageCol+"\nNO DATA TO DISPLAY\n*******************************");
				}else{//otherwise display the  col if index is within bounds
					//print 2d array
					print2DArray(my2DArray);
					System.out.println("\n\nArray at col("+col+") retrieved\n*******************************");
					printArray1D(colArray);

				}
				break;
			case 3:
				cellArray=promptCell();
				//print 2d array
				print2DArray(my2DArray);
				System.out.println("\n\nSpecified Array Element: "+getCell(cellArray[0],cellArray[1]));
				break;
			}

			System.out.println("Continue Application? Y for yes, any other key to end ");
			proceed =in.nextLine().equalsIgnoreCase("Y") ? true : false;
			if(proceed ==false){
				System.out.println("Are you sure ? Y for yes, any other key for no ");
				proceed=in.nextLine().equalsIgnoreCase("Y") ? false:true;

			}else{
				proceed =true;
			}
			
		}
		System.out.println("Application Ended");
		
	
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
		System.out.println("\nOriginal 2D array\n*******************************");
		//print 2D array
		for (int i=0;i<my2DArray.length ;i++ ) {
			for (int j=0;j<my2DArray[i].length ;j++ ) {
				System.out.print(my2DArray[i][j]+" ");
			}
			System.out.println();//output formatting

			if((row-1)==i){//check whether the index of an array matches the user's requested index
				rowArray=getRow(i);//return the row at the specified index if the index is within bounds
			}else if((row-1)<0 || (row-1)>my2DArray.length){//otherwise set the error message 
				errorMessageRow="Entered row is out of bounds";
			}
		}
	}

	//method to print the 2D.
	public static void print2DArray(int[][] my2DArray){
		System.out.println("\nOriginal 2D array\n*******************************");
		//print 2D array
		for (int i=0;i<my2DArray.length ;i++ ) {
			for (int j=0;j<my2DArray[i].length ;j++ ) {
				System.out.print(my2DArray[i][j]+" ");
			}
			System.out.println();//output formatting

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
					errorMessageCol="Entered col is out of bounds";
				}
			}
		}
		return column;
	}

	//method to return a specified value/element/cell in the 2D array
	public static String getCell(int row, int col){
		//declare flags to determine if the entered row and col is valid
		boolean isValidRow=false;
		boolean isValidCol=false;

		if ((row-1)<0||(row-1)>my2DArray.length) {// row validation check. row-1 because we want the index of the row
			errorMessageRow="Invalid row nr ("+row+") entered. No data available";
		}else{
			isValidRow=true;// entered row is valid set to true
			if ((col-1)<0||(col-1)>my2DArray[row-1].length) {//col validation check . col -1 because we want the index of the col
				errorMessageCol="Invalid col nr ("+col+") entered. No data available";
			}else{
				isValidCol=true;
			}
		}

		int element=(isValidRow&&isValidCol)? my2DArray[row-1][col-1] : 999_999_999;// if row and col are valid then assign element at row and col index

		//return the element or an error message depending on validation
		return (element!=999_999_999)? Integer.toString(element)+" at row(" +row +
		"), col(" +col+ ")": (isValidRow==false)? errorMessageRow: (isValidCol==false) ? errorMessageCol:" ";

	}

	//method to display menu 
	public static int printMenu(){
		Scanner kb = new Scanner(System.in);
		int menuOption=0;
		boolean isValidOption=false;
		while(isValidOption==false){
			System.out.println("***********Array Operations Menu**************\n(1) get Row\n(2) get Column"
				+"\n(3) get Cell\n**********************************************");
			try{
				menuOption=Integer.parseInt(kb.nextLine());//validate if input is a number
				//if option is a number then validate if on the menu
				switch(menuOption){
				case 1:
				case 2:
				case 3://if any of these cases then the menu option is valid
					System.out.println("Menu option ("+menuOption+") selected\n**********************************************");
					isValidOption=true;
					break;
				default:
					System.out.println("Invalid option. Select from 1, 2, 3\n");
					isValidOption=false;
					break;
				}
			}catch(Exception e){//option is not a number
				System.out.println("Invalid option. Select from 1, 2, 3\n");
				isValidOption=false;
			}
		}
		return menuOption;	
	}

	//method that requests a row from the user and validates the input
	public static int promptRow(){
		Scanner kb = new Scanner(System.in);
		int userRow =0;
		boolean isValidRow =false;
		while(isValidRow==false){
			System.out.println("Enter the row to print (1-10)");
			try{
				userRow=Integer.parseInt(kb.nextLine());//number validation
				if((userRow-1)<0||(userRow-1)>my2DArray.length){//validate if number is within acceptable range
					System.out.println("Row ("+userRow+") is invalid. Available rows are 1-10\n**********************************************");
					isValidRow =false;
				}else{
					System.out.println("Entered row ("+userRow+")\n**********************************************");
					isValidRow=true;
				}
			}catch(Exception e){
				System.out.println("Row ("+userRow+") is invalid. Available rows are 1-10\n**********************************************");
				isValidRow =false;
			}	
		}
		return userRow;
	}

	//method that requests a col from the user and validates the input
	public static int promptColumn(){
		Scanner kb = new Scanner(System.in);
		int userCol =0;
		boolean isValidCol =false;
		while(isValidCol==false){
			System.out.println("Enter the column to print (1-10)");
			try{
				userCol=Integer.parseInt(kb.nextLine());//number validation
				if((userCol-1)<0||(userCol-1)>my2DArray[0].length){//validate if number is within acceptable range
					System.out.println("Column ("+userCol+") is invalid. Available columns are 1-10\n**********************************************");
					isValidCol =false;
				}else{
					System.out.println("Entered column ("+userCol+")\n**********************************************");
					isValidCol=true;
				}
			}catch(Exception e){
				System.out.println("Column ("+userCol+") is invalid. Available columns are 1-10\n**********************************************");
				isValidCol =false;
			}	
		}
		return userCol;
	}

	//method that requests a row and col from the user and validates both options
	public static int [] promptCell(){
		int [] cellArray = new int[2];
		Scanner kb = new Scanner(System.in);
		int userCol =0;
		boolean isValidCol =false;
		int userRow =0;
		boolean isValidRow =false;

		while(isValidRow==false){
			System.out.println("Enter the row to print (1-10)");
			try{
				userRow=Integer.parseInt(kb.nextLine());//number validation
				if((userRow-1)<0||(userRow-1)>my2DArray.length){//validate if number is within acceptable range
					System.out.println("Row ("+userRow+") is invalid. Available rows are 1-10\n**********************************************");
					isValidRow =false;
				}else{
					System.out.println("Entered row ("+userRow+")\n**********************************************");
					isValidRow=true;
				}
			}catch(Exception e){
				System.out.println("Row ("+userRow+") is invalid. Available rows are 1-10\n**********************************************");
				isValidRow =false;
			}	
		}

		while(isValidCol==false){
			System.out.println("Enter the column to print (1-10)");
			try{
				userCol=Integer.parseInt(kb.nextLine());//number validation
				if((userCol-1)<0||(userCol-1)>my2DArray[0].length){//validate if number is within acceptable range
					System.out.println("Column ("+userCol+") is invalid. Available columns are 1-10\n**********************************************");
					isValidCol =false;
				}else{
					System.out.println("Entered column ("+userCol+")\n**********************************************");
					isValidCol=true;
				}
			}catch(Exception e){
				System.out.println("Column ("+userCol+") is invalid. Available columns are 1-10\n**********************************************");
				isValidCol =false;
			}	
		}
		cellArray[0]=userRow;
		cellArray[1]=userCol;
		return cellArray;
	}


}