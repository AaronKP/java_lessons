public class MyNestedClassesMain{
	public static void main(String[] args) {
		MyOuterClass outer = new MyOuterClass();
		MyOuterClass.MyInnerClass inner = outer.createInnerObject();
	}
}