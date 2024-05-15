public class NonVoidMethTest {
	public static void main(String[] args) {
		int back = testMeth(4);
		System.out.println("Got back = "+back);
	}
	
	static int testMeth(int param){
		System.out.println("Step 1");
		if(param == 1){
			return 1;
		}
		System.out.println("Step 2");
		if(param == 2){
			return 2;
		}
		System.out.println("Step 3");
		if(param == 3){
			return 3;
		}
		System.out.println("Step 4");
		if(param == 4){
			return 4;
		}
		System.out.println("Step 5");
		if(param == 5){
			return 5;
		}
		
		System.out.println("Step 6");
		if(param == 6){
			return 6;
		}

		
		System.out.println("unidentified step");
		return 0;
		
    }
}
