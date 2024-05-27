public class Local1Main {
	public static void main(String[] args) {		
		
		class Local {
			Local(){
				System.out.println("Constructing");
			}
		}
		Local localInstance = new Local();
		
	}
}
