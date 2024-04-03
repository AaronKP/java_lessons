public class ArrayPopulation1{

	//global array to store converted types 
	private static int [] boolToIntArray = new int[10];
	private static int [] byteToIntArray = new int[10];
	private static int [] shortToIntArray = new int[10];
	private static int [] charToIntArray = new int[10];
	private static int [] intToIntArray = new int[10];
	private static int [] floatToIntArray = new int[10];
	private static int [] longToIntArray = new int[10];
	private static int [] doubleToIntArray = new int[10];
	private static int [] stringToIntArray = new int[10];

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

	//field to store error message when trying to convert from String array to int array
	private static String stringErrorMessage="";

	public static void main(String[] args) {

		//print default array values.
		System.out.println("**********************************************************");
		System.out.println("\nDefault boolean array:");
		printDefaultArray(arrayBool);
		System.out.println("\n\nDefault byte array:");
		printDefaultArray(arrayByte);
		System.out.println("\n\nDefault short array:");
		printDefaultArray(arrayShort);
		System.out.println("\n\nDefault char array:");
		printDefaultArray(arrayChar);
		System.out.println("\n\nDefault int array:");
		printDefaultArray(arrayInt);
		System.out.println("\n\nDefault float array:");
		printDefaultArray(arrayFloat);
		System.out.println("\n\nDefault long array:");
		printDefaultArray(arrayLong);
		System.out.println("\n\nDefault double array:");
		printDefaultArray(arrayDouble);
		System.out.println("\n\nDefault String array:");
		printDefaultArray(arrayString);

		//assign custom value to last index of array 
		System.out.println("\n\n**********************************************************");
		assignValueLastIndex(arrayBool);
		assignValueLastIndex(arrayByte);
		assignValueLastIndex(arrayShort);
		assignValueLastIndex(arrayChar);
		assignValueLastIndex(arrayInt);
		assignValueLastIndex(arrayFloat);
		assignValueLastIndex(arrayLong);
		assignValueLastIndex(arrayDouble);
		assignValueLastIndex(arrayString);

		
		//print arrays with last index being assigned a value.
		System.out.println("\n\n**********************************************************");
		//print array with last index changed 
		System.out.println("\n\nAssigned Last index- boolean array:");
		printDefaultArray(arrayBool);
		System.out.println("\n\nAssigned Last index- byte array:");
		printDefaultArray(arrayByte);
		System.out.println("\n\nAssigned Last index- short array:");
		printDefaultArray(arrayShort);
		System.out.println("\n\nAssigned Last index- char array:");
		printDefaultArray(arrayChar);
		System.out.println("\n\nAssigned Last index- int array:");
		printDefaultArray(arrayInt);
		System.out.println("\n\nAssigned Last index- float array:");
		printDefaultArray(arrayFloat);
		System.out.println("\n\nAssigned Last index- long array:");
		printDefaultArray(arrayLong);
		System.out.println("\n\nAssigned Last index- double array:");
		printDefaultArray(arrayDouble);
		System.out.println("\n\nAssigned Last index- String array:");
		printDefaultArray(arrayString);

		//convert arrays to int [] 
		//System.out.println("\n\n**********************************************************");
		// convertToIntArray(arrayBool);
		// convertToIntArray(arrayByte);
		// convertToIntArray(arrayShort);
		// convertToIntArray(arrayChar);
		// convertToIntArray(arrayInt);
		// convertToIntArray(arrayFloat);
		// convertToIntArray(arrayLong);
		// convertToIntArray(arrayDouble);
		// convertToIntArray(arrayString);

		//print Converted default arrays of type int[] 
		// System.out.println("\n\n**********************************************************");
		// printArray("\n\nConverted boolean array:",boolToIntArray);
		// printArray("\n\nConverted byte array:",byteToIntArray);
		// printArray("\n\nConverted short array:",shortToIntArray);
		// printArray("\n\nConverted char array:",charToIntArray);
		// printArray("\n\nConverted int array:",intToIntArray);
		// printArray("\n\nConverted float array:",floatToIntArray);
		// printArray("\n\nConverted long array:",longToIntArray);
		// printArray("\n\nConverted double array:",doubleToIntArray);
		// printArray("\n\nConverted String array:",stringToIntArray);

		//populate arrays with index values as the elements in each array
		System.out.println("\n\n**********************************************************");
		populateWithIndexVal(arrayBool);
		populateWithIndexVal(arrayByte);
		populateWithIndexVal(arrayShort);
		populateWithIndexVal(arrayChar);
		populateWithIndexVal(arrayInt);
		populateWithIndexVal(arrayFloat);
		populateWithIndexVal(arrayLong);
		populateWithIndexVal(arrayDouble);
		populateWithIndexVal(arrayString);

		//print arrays with the index values assigned
		System.out.println("\n\n**********************************************************");
		//print array with last index changed 
		System.out.println("\n\nAssigned index values - boolean array:");
		printDefaultArray(arrayBool);
		System.out.println("\n\nAssigned index values - byte array:");
		printDefaultArray(arrayByte);
		System.out.println("\n\nAssigned index values - short array:");
		printDefaultArray(arrayShort);
		System.out.println("\n\nAssigned index values - char array:");
		printDefaultArray(arrayChar);
		System.out.println("\n\nAssigned index values - int array:");
		printDefaultArray(arrayInt);
		System.out.println("\n\nAssigned index values - float array:");
		printDefaultArray(arrayFloat);
		System.out.println("\n\nAssigned index values - long array:");
		printDefaultArray(arrayLong);
		System.out.println("\n\nAssigned index values - double array:");
		printDefaultArray(arrayDouble);
		System.out.println("\n\nAssigned index values - String array:");
		printDefaultArray(arrayString);


		
	}

	//method to print array contents.
	public static void printDefaultArray(Object array){
		switch(array.getClass().getTypeName()){//return the name of the array type and compare against cases
		case "boolean[]": 
			for(boolean x : (boolean[])array) System.out.print(x + " ");// cast needed to print array elements
			break;
		case "byte[]":
			for(byte x : (byte[])array) System.out.print(x + " ");
			break;
		case "short[]":
			for(short x : (short[])array) System.out.print(x + " ");
			break;
		case "char[]":
			for(char x : (char[])array) System.out.print(x + " ");
			break;
		case "int[]":
			for(int x : (int[])array) System.out.print(x + " ");
			break;
		case "float[]":
			for(float x : (float[])array) System.out.print(x + " ");
			break;
		case "long[]":
			for(long x : (long[])array) System.out.print(x + " ");
			break;
		case "double[]":
			for(double x : (double[])array) System.out.print(x + " ");
			break;
		case "java.lang.String[]":
			for(String x : (String[])array) System.out.print(x + " ");
			break;
	
		}

	}

	//method to convert array of one data type to an array of type int 
	public static String convertToIntArray(Object array){

		switch(array.getClass().getTypeName()){//return the name of the array type and compare against cases
		case "boolean[]": 
			boolean [] tempArray= (boolean[])array;
			for (int i =0;i<tempArray.length ;i++ ) {
				boolToIntArray[i] = tempArray[i]==false ? 0 : 1;//assign 0 if element is false or 1 if true
			}
			break;
		case "byte[]":
			byte [] tempByteArray= (byte[])array;
			for (int i =0;i< tempByteArray.length ;i++ ) {
				byteToIntArray[i]=tempByteArray[i];//implicit casting occurs
			}
			break;
		case "short[]":
			short [] tempShortArray= (short[])array;
			for (int i =0;i< tempShortArray.length ;i++ ) {
				shortToIntArray[i]=tempShortArray[i];
			}
			break;
		case "char[]":
			char [] tempCharArray= (char[])array;
			for (int i =0;i< tempCharArray.length ;i++ ) {
				charToIntArray[i]=tempCharArray[i];
			}
			break;
		case "int[]":
			intToIntArray=(int[])array;// no need for conversions. Can just assign casted object array
			break;
		case "float[]":
			float [] tempFloatArray= (float[])array;
			for (int i =0;i< tempFloatArray.length ;i++ ) {
				floatToIntArray[i]=(int)tempFloatArray[i];
			}

			break;
		case "long[]":
			long [] tempLongArray= (long[])array;
			for (int i =0;i< tempLongArray.length ;i++ ) {
				longToIntArray[i]=(int)tempLongArray[i];
			}
			break;
		case "double[]":
			double [] tempDoubleArray= (double[])array;
			for (int i =0;i< tempDoubleArray.length ;i++ ) {
				doubleToIntArray[i]=(int)tempDoubleArray[i];
			}
			break;
		case "java.lang.String[]":
			String [] tempStringArray = (String[]) array;// initialize temp array to store casted object array- used in for loop
			for (int i =0;i<tempStringArray.length ;i++ ) {
				try{//attempt number conversion
					if(tempStringArray[i]==null){// if there are null values in the string array then the eqyuivalent int default is 0
						stringToIntArray[i]=0;
					}else{
						stringToIntArray[i]=Integer.parseInt(tempStringArray[i]);//for cases where the element is not a null value.
					}
					
				}catch(Exception e){//assign error message to be displayed
					stringErrorMessage="Some elements of string array can't be stored in int array";
				}
			}
			break;
		}
		return stringErrorMessage;
	}

	//method to print array elements
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

    //method to assign a value to the last index of the arrays
    public static void assignValueLastIndex(Object array){
    	switch(array.getClass().getTypeName()){//return the name of the array type and compare against cases
		case "boolean[]": 
			arrayBool[arrayBool.length-1]=true;
			break;
		case "byte[]":
			arrayByte[arrayByte.length-1]=122;
			break;
		case "short[]":
			arrayShort[arrayShort.length-1]=32000;
			break;
		case "char[]":
			arrayChar[arrayChar.length-1]=65;
			break;
		case "int[]":
			arrayInt[arrayInt.length-1]=22;
			break;
		case "float[]":
			arrayFloat[arrayFloat.length-1]=98.0F;
			break;
		case "long[]":
			arrayLong[arrayLong.length-1]=1000;
			break;
		case "double[]":
			arrayDouble[arrayDouble.length-1]=2222.678;
			break;
		case "java.lang.String[]":
			arrayString[arrayString.length-1]="Aaron";
			break;
		}
    }

    //method to populate array with index values
    public static void populateWithIndexVal(Object array){
    	switch(array.getClass().getTypeName()){//return the name of the array type and compare against cases
		case "boolean[]": 
			for (int i =0;i<arrayBool.length ;i++ ) {
				arrayBool[i]= (i%2==0)? true:false;
			}
			break;
		case "byte[]":
			for (int i =0;i<arrayByte.length ;i++ ) {
				arrayByte[i]=(byte)i;
			}
			break;
		case "short[]":
			for (int i =0;i<arrayShort.length ;i++ ) {
				arrayShort[i]=(short)i;
			}
			break;
		case "char[]":
			for (int i =0;i<arrayChar.length ;i++ ) {
				arrayChar[i]=(char)i;
			}
			break;
		case "int[]":
			for (int i =0;i<arrayInt.length ;i++ ) {
				arrayInt[i]=i;
			}
			break;
		case "float[]":
			for (int i =0;i<arrayFloat.length ;i++ ) {
				arrayFloat[i]=i;
			}
			break;
		case "long[]":
			for (int i =0;i<arrayLong.length ;i++ ) {
				arrayLong[i]=i;
			}
			break;
		case "double[]":
			for (int i =0;i<arrayDouble.length ;i++ ) {
				arrayDouble[i]=i;
			}
			break;
		case "java.lang.String[]":
			for (int i =0;i<arrayString.length ;i++ ) {
				arrayString[i]=Integer.toString(i);
			}
			break;
		}
    }

}