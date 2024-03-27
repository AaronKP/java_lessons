import java.util.Random;

public class ArrayChallenge361{
	public static void main(String[] args) {
		
		int [][][] array3 = new int[10][10][3];
		int[][] array2 = new int [10][10];
		
		populate2D(array2);
		populate3D(array3);
		int dimensions=getArrayDimensions(array2);
		printArray(array2,dimensions);
		// System.out.println("\n2D array elements:\n");
		// print2D(array2);
		// System.out.println("\n3D array elements:\n");
		// print3D(array3);

	}
	

	//method to populate 2D array
	public static void populate2D(int [][] array2){
		Random random = new Random();
		for (int i=0;i<array2.length ;i++ ) {//loops to cycle through array
			for (int j=0;j<array2[i].length ;j++) {
				array2[i][j]=random.nextInt(100)+1;//used to store random nrs 1-100
			}
		}
	}

	//method to populate 3D array
	public static void populate3D(int [][][] array3){
		Random random = new Random();
		for (int i=0;i<array3.length ;i++ ) {//loops to cycle through array
			for (int j=0;j<array3[i].length ;j++ ) {
				for (int k=0;k<array3[i][j].length ;k++) {
					array3[i][j][k]=random.nextInt(100)+1;//used to store random nrs 1-100
				}
			}
		}
	}

	//method to print 2D array
	public static void print2D(int [][] array2){
		for (int i=0;i<array2.length ;i++ ) {//loops to cycle through array
			for (int j=0;j<array2[i].length ;j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();//for output formatting on console
		}
	}

	//method to print 3D array
	public static void print3D(int [][][] array3){
		for (int i=0;i<array3.length ;i++ ) {//loops to cycle through array
			System.out.println("*******Layer "+(i+1)+"*******");//for output formatting on console
			for (int j=0;j<array3[i].length ;j++ ) {
				for (int k=0;k<array3[i][j].length ;k++) {
					System.out.print(array3[i][j][k]+" ");
				}
				System.out.println();//for output formatting on console
			}
			System.out.println();//for output formatting on console
		}
	}

	//Arrays are treated as objects therefore are of the Object class type/ Every object inherits from the Object class
	//this method accepts arrays of any time
	public static int getArrayDimensions(Object array){
		int dimensions=0;
		String arrayClassName= array.getClass().getName();
		for(char c: arrayClassName.toCharArray()){//convert className to char array
			if (c=='[') {
				dimensions++;//count the number of [ as an indicator of of the dimensions
			}
		}
		return dimensions;
	}

	//Alternative print method that take in an array and it's dimensions
	public static void printArray(Object myArray, int dimensions){
		switch(dimensions){
		case 2:
			int[][] array2D = (int [][])myArray;
			for (int i=0;i<array2D.length ;i++ ) {//loops to cycle through array
				for (int j=0;j<array2D[i].length ;j++) {
					System.out.print(array2D[i][j]+" ");
				}
				System.out.println();//for output formatting on console
			}
			break;
		case 3:
			int [][][]array3D = (int [][][])myArray;
			for (int i=0;i<array3D.length ;i++ ) {//loops to cycle through array
				System.out.println("*******Layer "+(i+1)+"*******");//for output formatting on console
				for (int j=0;j<array3D[i].length ;j++ ) {
					for (int k=0;k<array3D[i][j].length ;k++) {
						System.out.print(array3D[i][j][k]+" ");
					}
					System.out.println();//for output formatting on console
				}
				System.out.println();//for output formatting on console
			}
			break;
		default:
			break;
		}
	}

}