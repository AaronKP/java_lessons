import java.util.Random;

public class arrayChallenge362{

	private static final int NRS_TO_GENERATE =10;

	public static void main(String[] args) {
		//array declaration
		int [] even = new int[100];
		int [] odd = new int[100];
		int [] prime = new int[100];
		int [][] nrArray = new int[3][100];
		//populate1Darrays(even,odd,prime);
		populateEven(even);
		populateOdd(odd);
		populatePrime(prime);
		print1Darrays(even,odd,prime);
		
		populate2DArray(even,odd,prime,nrArray);
		print2Darray(nrArray);
		
		
	}

	//populate even array
	public static void populateEven(int[] even){
		Random random = new Random();
		boolean stillLoop;
		for (int i=0;i<even.length ;i++ ) {
			stillLoop=true;//the while loop controls the population of all elements with random nrs
			while(stillLoop){
				int rndNr = random.nextInt(NRS_TO_GENERATE);
				if (rndNr%2==0) {//check if random number generated is even. Store in even array if true
					even[i]=rndNr;
					stillLoop=false;
				}
			}
			
		}
	}

	//populate odd aray
	public static void populateOdd(int[] odd){
		Random random = new Random();
		boolean stillLoop;
		for (int i=0;i<odd.length ;i++ ) {
			stillLoop=true;//the while loop controls the population of all elements with random nrs
			while(stillLoop){
				int rndNr = random.nextInt(NRS_TO_GENERATE);
				if (rndNr%2!=0) {//check if random number generated is odd. Store in odd array if true
					odd[i]=rndNr;
					stillLoop=false;
				}
			}

		}
	}

	//populate array for prime numbers
	public static void populatePrime(int[] prime){
		Random random = new Random();
		boolean stillLoop;
		for (int i=0;i<prime.length ;i++ ) {
			stillLoop=true;//the while loop controls the population of all elements with random nrs
			while(stillLoop){
				int rndNr = random.nextInt(NRS_TO_GENERATE);
				if (isPrimeNumber(rndNr)) {//check if nr is a prime number
					prime[i]=rndNr;
					stillLoop=false;
				}
			}

		}
	}

	//method to check if a number is a prime number
	public static boolean isPrimeNumber(int nr){
		int nrOfFactors=0;

		for (int i =1;i<=nr ;i++ ) {// i represents the values we are using to test to see if they are factors of nr
			if(nr%i==0){
				nrOfFactors++;// if 2, then it means it is a prime number.
			}
		}
		return (nrOfFactors==2)||nr==1? true :false;// if 2 factors or if nr is 1, then it means it is a prime number.
	}


	//method to print ALL 1D arrays
	public static void print1Darrays(int[] even,int[] odd,int[] prime){
		System.out.println("\n1D ARRAY ELEMENTS:\n***************************************************");
		System.out.println("Even Nrs\tOdd Nrs\t\tPrime Nrs");
		System.out.println("***************************************************");
		for (int i =0;i<even.length;i++ ) {
			System.out.print(even[i]+"\t\t");
			System.out.print(odd[i]+"\t\t");
			System.out.println(prime[i]);
		}
	}

	//method to populate 2D array by merging the 3 1D arrays into the 2D array
	public static void populate2DArray(int[] even, int[] odd, int [] prime, int[][] nrArray){
		for (int i =0;i<nrArray.length ;i++ ) {
			for (int j=0;j<even.length ;j++ ) {//iterates over all 100 elements from all arrays
				switch(i){
				case 0://case for even array
					nrArray[i][j]=even[j];
					break;
				case 1://case for odd array
					nrArray[i][j]=odd[j];
					break;
				case 2://case for prime nr array
					nrArray[i][j]=prime[j];
					break;
				}
			}
			
		}
	}

	//method to print the 2D array
	public static void print2Darray(int [][] nrArray){
		System.out.println("\n2D ARRAY ELEMENTS\n***************************************************");
		for (int i =0;i<nrArray.length ;i++ ) {
			for (int j =0;j<nrArray[i].length ;j++ ) {
				System.out.print(nrArray[i][j]+ " ");
			}
			System.out.println();//output formatting pruposes
			System.out.println();
		}
	}

	//method to populate all 1 D arrays
	public static void populate1Darrays(int[] even, int[] odd, int [] prime){
		Random random = new Random();
		//counters used so that no default values are stored in between elements of the array
		int evenCounter=0;
		int oddCounter=0;
		int primeCounter=0;

		for (int i=0;i<even.length ;i++ ) {
			int rndNr = random.nextInt(10);
			if (rndNr%2==0) {//check if random number generated is even. Store in even array if true
				even[evenCounter]=rndNr;
				evenCounter++;
			}else{
				odd[oddCounter]=rndNr;//otherwise store in odd array 
				oddCounter++;
			}
			if (isPrimeNumber(rndNr)) {//check if nr is a prime number
				prime[primeCounter]=rndNr;
				primeCounter++;
			}
		}
	}	
}