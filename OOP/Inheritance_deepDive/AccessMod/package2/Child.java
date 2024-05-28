package package2;

import package1.*;

public class Child extends Parent{

	public Child(String name, String age){
		super(name,age);

	}

	public Child(String name, String age,String hobby){
		
		//super(name,age);
		this(name,age);
		
	}

	protected static void myMethod2(){
		myMethod1();
		System.out.println("I am a child.");
	}

	public static void child(){
		family();
		System.out.println("We are family.");
	}
}