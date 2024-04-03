public class ArrayPopulation6{

	//default array declaration. Destination arrays
	private static boolean [] arrayBool = new boolean[10];
	private static byte [] arrayByte = new byte[10];
	private static short [] arrayShort = new short[10];
	private static char [] arrayChar = new char[10];
	private static int [] arrayInt = new int[10];
	private static float [] arrayFloat = new float[10];
	private static long [] arrayLong = new long[10];
	private static double [] arrayDouble = new double[10];
	private static String [] arrayString = new String[10];

	public static void main(String[] args) {
		//source array declaration
		int[] source = new int[10];
		populateSource(source);
		//print source array
		printArray("\n********************************\nSource Array:",source);
       
       //copy first 3 elements from source into destination arrays
		copyContent(source,arrayBool);
		copyContent(source,arrayByte);
		copyContent(source,arrayShort);
		copyContent(source,arrayChar);
		copyContent(source,arrayInt);
		copyContent(source,arrayFloat);
		copyContent(source,arrayLong);
		copyContent(source,arrayDouble);
		copyContent(source,arrayString);

		//print array contents
		printArray("\n***************\nboolean Array contents:",arrayBool);
		printArray("\n***************\nbyte Array contents:",arrayByte);
		printArray("\n***************\nshort Array contents:",arrayShort);
		printArray("\n***************\nchar Array contents:",arrayChar);
		printArray("\n***************\nint Array contents:",arrayInt);
		printArray("\n***************\nfloat Array contents:",arrayFloat);
		printArray("\n***************\nlong Array contents:",arrayLong);
		printArray("\n***************\ndouble Array contents:",arrayDouble);
		printArray("\n***************\nString Array contents:",arrayString);
	}

	//method to print array contents.
	public static void printArray(String prefix,Object array){
		switch(array.getClass().getTypeName()){//return the name of the array type and compare against cases
		
		case "boolean[]": 
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayBool.length;i++) {
            	System.out.print(arrayBool[i]);
            	
            	if(i != arrayBool.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "byte[]":
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayByte.length;i++) {
            	System.out.print(arrayByte[i]);

            	if(i != arrayByte.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "short[]":
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayShort.length;i++) {
            	System.out.print(arrayShort[i]);

            	if(i != arrayShort.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "char[]":
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayChar.length;i++) {
            	System.out.print(arrayChar[i]);

            	if(i != arrayChar.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "int[]":
			int [] tempIntArray= (int[])array;
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < tempIntArray.length;i++) {
            	System.out.print(tempIntArray[i]);

            	if(i != tempIntArray.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "float[]":
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayFloat.length;i++) {
            	System.out.print(arrayFloat[i]);

            	if(i != arrayFloat.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "long[]":
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayLong.length;i++) {
            	System.out.print(arrayLong[i]);

            	if(i != arrayLong.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "double[]":
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayDouble.length;i++) {
            	System.out.print(arrayDouble[i]);

            	if(i != arrayDouble.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;

		case "java.lang.String[]":
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayString.length;i++) {
            	System.out.print(arrayString[i]);

            	if(i != arrayString.length-1){
            		System.out.print(",");
            	}
        	}
        	System.out.print("]\n");
			break;
	
		}

	}

	//method to populate source array
	public static void populateSource(int[] source){
		for (int i=0;i<source.length ;i++ ) {
			source[i]=(int)(Math.random()*100);
		}
	}

	//method that copies the first 3 elements from a source array into a destination array
	public static void copyContent(int [] source, Object array){
		switch(array.getClass().getTypeName()){//return the name of the array type and compare against cases
		case "boolean[]": 
			for (int i =0;i<3 ;i++ ) {
				arrayBool[i]= (source[i]>0)? true: false;			
			}
			break;
		case "byte[]":
			for (int i =0;i<3 ;i++ ) {
				arrayByte[i]= (byte)(source[i]);//cast to prevent lossy conversions
			}
			break;
		case "short[]":
			for (int i =0;i<3;i++ ) {
				arrayShort[i]= (short)(source[i]);
			}
			break;
		case "char[]":
			for (int i =0;i<3 ;i++ ) {
				arrayChar[i]= (char)(source[i]);
			}
			break;
		case "int[]":
			for (int i =0;i<3 ;i++ ) {
				arrayInt[i]= source[i];
			}
			break;
		case "float[]":
			for (int i =0;i<3 ;i++ ) {
				arrayFloat[i]= source[i];
			}
			break;
		case "long[]":
			for (int i =0;i<3 ;i++ ) {
				arrayLong[i]= source[i];
			}
			break;
		case "double[]":
			for (int i =0;i<3 ;i++ ) {
				arrayDouble[i]= source[i];
			}
			break;
		case "java.lang.String[]":
			for (int i =0;i<3 ;i++ ) {
				arrayString[i]= Integer.toString(source[i]);
			}
			break;
		}
	}
}