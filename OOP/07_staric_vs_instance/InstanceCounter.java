public class InstanceCounter {
	
	public static int staticCounter;
    public int objectCounter;
	
    public InstanceCounter(){
		incrementStaticCounter();
		System.out.println("new object created:"+staticCounter);
		incrementObjectCounter();             
    }

	public static void incrementStaticCounter(){
		staticCounter++;
		System.out.println("Number of instances in static:"+staticCounter);
	}

	public void incrementObjectCounter(){
        objectCounter++;
		System.out.println("Counter in instance:"+objectCounter);
	}

	public int getStaticCounter(){
		return staticCounter;
	}

	public int getObjectCounter(){
		return objectCounter;
	}

}


// public class InstanceCounter {
	
// 	static int counter;
	
// 	public InstanceCounter(){
// 		counter++;
// 		System.out.println("I am instance number:"+counter);
// 	}

// }
