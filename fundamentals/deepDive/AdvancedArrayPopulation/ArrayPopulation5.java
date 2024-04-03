
public class ArrayPopulation5{
	//default array declaration
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
		//zero pad the first 5 elements in the array
		zeroPad(arrayBool);
		zeroPad(arrayByte);
		zeroPad(arrayShort);
		zeroPad(arrayChar);
		zeroPad(arrayInt);
		zeroPad(arrayFloat);
		zeroPad(arrayLong);
		zeroPad(arrayDouble);
		zeroPad(arrayString);

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
			System.out.print(prefix);
        	System.out.print("[");
        	for (int i =0;i < arrayInt.length;i++) {
            	System.out.print(arrayInt[i]);

            	if(i != arrayInt.length-1){
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

	//method to zero padd the first 5 elements of an array
	public static void zeroPad(Object array){
		switch(array.getClass().getTypeName()){//return the name of the array type and compare against cases
		case "boolean[]": 
			for (int i =0;i<arrayBool.length ;i++ ) {
				arrayBool[i]= (i<5)? false : true;			
			}
			break;
		case "byte[]":
			for (int i =0;i<arrayByte.length ;i++ ) {
				arrayByte[i]= (i<5)? 0 : (byte)(Math.random()*100);//cast to prevent lossy conversions
			}
			break;
		case "short[]":
			for (int i =0;i<arrayShort.length ;i++ ) {
				arrayShort[i]= (i<5)?0: (short)(Math.random()*100);
			}
			break;
		case "char[]":
			for (int i =0;i<arrayChar.length ;i++ ) {
				arrayChar[i]= (i<5)?'0': (char)(Math.random()*100);
			}
			break;
		case "int[]":
			for (int i =0;i<arrayInt.length ;i++ ) {
				arrayInt[i]= (i<5)?0: (int)(Math.random()*100);
			}
			break;
		case "float[]":
			for (int i =0;i<arrayFloat.length ;i++ ) {
				arrayFloat[i]= (i<5)?0:(float)(Math.random()*100);
			}
			break;
		case "long[]":
			for (int i =0;i<arrayLong.length ;i++ ) {
				arrayLong[i]= (i<5)?0:(long)(Math.random()*100);
			}
			break;
		case "double[]":
			for (int i =0;i<arrayDouble.length ;i++ ) {
				arrayDouble[i]= (i<5)?0:Math.random()*100;
			}
			break;
		case "java.lang.String[]":
			for (int i =0;i<arrayString.length ;i++ ) {
				arrayString[i]= (i<5)?"0":Integer.toString((int)(Math.random()*100));
			}
			break;
		}
	}
}