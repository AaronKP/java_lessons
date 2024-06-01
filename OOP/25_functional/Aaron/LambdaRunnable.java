public class LambdaRunnable{
	public static void main(String[] args) {
		Runnable runnableLambda = ()-> {
			for (int i =0;i<10 ;i++ ) {
			System.out.println(i+1+") Aaron");
		}};
		runnableLambda.run();
	}
}