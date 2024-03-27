import java.util.Random;//import so we can generate random integers to populate array

public class GoingBracketless{
	public static void main(String[] args) {
		int [] myArray = new int[11];//declare array size 11
		populateArrayRandom(myArray);
		printElements(myArray);
	}

	// method to populate array with random integers
	public static void populateArrayRandom(int [] myArray){
		Random random = new Random();
		// because we want to print numbers starting at 2 use + 2
		for(int i=0;i<myArray.length;i++) myArray[i]=random.nextInt(10)+2;
		//using bracketless while
		int j=0;
		while(j<myArray.length) myArray[j++]=random.nextInt(10)+2;//use post increment operator to increment loop control

	}


	//method to print elements of array (using bracketless for loop) and determine if the element is greater than a certain number
	// public static void printElements(int [] myArray){
	// 	for(int i=0;i<myArray.length;i++)//iterates from 0 -10
	// 		if (myArray[i] > 9) System.out.println(myArray[i]+" is greater than 9");
	// 		else if (myArray[i] > 8) System.out.println(myArray[i]+" is greater than 8");
	// 		else if (myArray[i] > 7) System.out.println(myArray[i]+" is greater than 7");
	// 		else if (myArray[i] > 6) System.out.println(myArray[i]+" is greater than 6");
	// 		else if (myArray[i] > 5) System.out.println(myArray[i]+" is greater than 5");
	// 		else if (myArray[i] > 4) System.out.println(myArray[i]+" is greater than 4");
	// 		else if (myArray[i] > 3) System.out.println(myArray[i]+" is greater than 3");
	// 		else if (myArray[i] > 2) System.out.println(myArray[i]+" is greater than 2");
	// 		else if (myArray[i] > 1) System.out.println(myArray[i]+" is greater than 1");
	// }

	//method to print elements of array (using bracketless while loop) and determine if the element is greater than a certain number
	// public static void printElements(int [] myArray){
	// 	int i=0;
	// 	while(i<myArray.length)
	// 		i=printMessageIncrement_i(myArray[i],i);//braceless while loops only execute a single statement

	// 		// switch(myArray[i]){
	// 		// case 2: 
	// 		// 	System.out.println(myArray[i]+" is greater than 1");
	// 		// 	i++;
	// 		// 	break;
	// 		// case 3:
	// 		// 	System.out.println(myArray[i]+" is greater than 2");
	// 		// 	i++;
	// 		// 	break;
	// 		// case 4:
	// 		// 	System.out.println(myArray[i]+" is greater than 3");
	// 		// 	i++;
	// 		// 	break;
	// 		// case 5:
	// 		// 	System.out.println(myArray[i]+" is greater than 4");
	// 		// 	i++;
	// 		// 	break;
	// 		// case 6:
	// 		// 	System.out.println(myArray[i]+" is greater than 5");
	// 		// 	i++;
	// 		// 	break;
	// 		// case 7:
	// 		// 	System.out.println(myArray[i]+" is greater than 6");
	// 		// 	i++;
	// 		// 	break;
	// 		// case 8:
	// 		// 	System.out.println(myArray[i]+" is greater than 7");
	// 		// 	i++;
	// 		// 	break;
	// 		// case 9:
	// 		// 	System.out.println(myArray[i]+" is greater than 8");
	// 		// 	i++;
	// 		// 	break;
	// 		// default:
	// 		// 	System.out.println(myArray[i]+" is greater than 9");
	// 		// 	i++;
	// 		// 	break;

	// 		// }
			
	// }

	

	// //method to print elements of array (using bracketless do-while) and determine if the element is greater than a certain number
	public static void printElements(int [] myArray){
		int i=0;
		do
		i=printMessageIncrement_i(myArray[i],i);
		 // switch(myArray[i]){
		// 	case 2: 
		// 		System.out.println(myArray[i]+" is greater than 1");
		// 		i++;
		// 		break;
		// 	case 3:
		// 		System.out.println(myArray[i]+" is greater than 2");
		// 		i++;
		// 		break;
		// 	case 4:
		// 		System.out.println(myArray[i]+" is greater than 3");
		// 		i++;
		// 		break;
		// 	case 5:
		// 		System.out.println(myArray[i]+" is greater than 4");
		// 		i++;
		// 		break;
		// 	case 6:
		// 		System.out.println(myArray[i]+" is greater than 5");
		// 		i++;
		// 		break;
		// 	case 7:
		// 		System.out.println(myArray[i]+" is greater than 6");
		// 		i++;
		// 		break;
		// 	case 8:
		// 		System.out.println(myArray[i]+" is greater than 7");
		// 		i++;
		// 		break;
		// 	case 9:
		// 		System.out.println(myArray[i]+" is greater than 8");
		// 		i++;
		// 		break;
		// 	default:
		// 		System.out.println(myArray[i]+" is greater than 9");
		// 		i++;
		// 		break;

		// 	}	
		while(i<myArray.length);
	}

	//Alternative - helper method for printing of multiple statements in a braceless while 
	public static int printMessageIncrement_i(int element, int i){
		if (element > 9) System.out.println(element+" is greater than 9");
			else if (element > 8) System.out.println(element+" is greater than 8");
			else if (element > 7) System.out.println(element+" is greater than 7");
			else if (element > 6) System.out.println(element+" is greater than 6");
			else if (element > 5) System.out.println(element+" is greater than 5");
			else if (element > 4) System.out.println(element+" is greater than 4");
			else if (element > 3) System.out.println(element+" is greater than 3");
			else if (element > 2) System.out.println(element+" is greater than 2");
			else if (element > 1) System.out.println(element+" is greater than 1");
		return i+=1;
	}
}