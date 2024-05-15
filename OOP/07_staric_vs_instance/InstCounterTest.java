public class InstCounterTest {
	public static void main(String[] args) {
		InstanceCounter obj1 = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();

		//sysout InstanceCounter.staticCounter

        InstanceCounter.staticCounter = 1000;

        //sysout InstanceCounter.staticCounter

        //increment object counter 1

        //increment static counter = 1001
                        

	}
}

// public class InstCounterTest {
// 	public static void main(String[] args) {
// 		new InstanceCounter();
// 		new InstanceCounter();
// 		new InstanceCounter();
// 		new InstanceCounter();
// 	}
// }
