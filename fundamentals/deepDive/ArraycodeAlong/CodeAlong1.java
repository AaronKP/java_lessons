public class CodeAlong1{
	public static void main(String[] args) {
		//array declaration
		int [][] max ={
			{1,2,3,4,5,6,7,8,9,10},
			{11,12,13,14,15,16,17,18,19,20},
			{21,22,23,24,25,26,27,28,29,30},
			{31,32,33,34,35,36,37,38,39,40},
			{41,42,43,44,45,46,474,84,49,50},
			{51,52,53,54,55,56,57,58,59,60},
			{61,62,63,64,65,66,67,68,69,70},
			{71,72,73,74,75,76,77,78,79,80},
			{81,82,83,84,85,86,87,88,89,90},
			{91,929,93,94,95,96,97,98,99,100}
		};
		count(max);
	}

	public static void count(int [][] max){//print array method
		//int i=1;
		// do{
		// 	System.out.println(i);
		// 	i++;
		// }while(i<=10);

		for (int i=0;i<max.length ;i++ ) {
			for (int j=0;j<max[i].length ;j++ ) {
				System.out.print(max[i][j]+" ");
			}
			System.out.println();
		}

		// while(i<=10){
		// 	System.out.println(i);
		// 	i++;
		// }
	}
}