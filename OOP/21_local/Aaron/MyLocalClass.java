public class MyLocalClass{
	
	// Instance variable
    private int myValue;
    //constructor
	public MyLocalClass(int value){

	}


    // Static instance initializer
    static {
        System.out.println("Static instance initializer block...");
    }
    
    // Instance initializer
    {
        System.out.println("Instance initializer block executed.");
    }
    
    // Void method
    public void myMethod() {
    	// Ordinary block within the method
    	{
            System.out.println("ordinary block with void method");
    	}
    }

    


}