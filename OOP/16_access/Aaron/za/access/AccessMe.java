package za.access;

  protected class AccessMe{

	protected static String name;

	// public static void main(String[] args) {
	// 	setName("Bean");
	// 	System.out.println("Output is:"+getName());
	// }

	public static String getName(){
		return name;
	}

	public static void setName(String input){
		name=input;
	}
}