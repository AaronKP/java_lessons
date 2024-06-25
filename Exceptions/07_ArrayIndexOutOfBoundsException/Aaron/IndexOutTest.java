public class IndexOutTest {
	public static void main(String[] args) {
		int [] array = {444,55,666};
		try{
			int value = array[4];
			System.out.println("Value = "+value);
		}catch(ArrayIndexOutOfBoundsException aex){
			System.out.println("Index is out of bounds for array");
		}
		
		
		
	}
}
