public class CharTest{
    public static void main(String [] args){

    	long mylong= 3L;
	    char myChar = mylong + '4' ;
	    //LHS - '4' is cast to an Int by java (unicode is 52)
	    // 1+ 52 = 53 , but this is cast back to char ( corresponding value of 53 is 5)
		
		System.out.println(myChar);//output is 5
	}
}
