 public class InitErrorTest {	
	static Object member = null;
	
	static{
		try{
			member.toString();
		}catch(Exception e){
			System.out.println("static initializer exception"+e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {	
		System.out.println("Step 1");
	}
}

