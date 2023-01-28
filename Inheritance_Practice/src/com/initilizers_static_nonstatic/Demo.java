package com.initilizers_static_nonstatic;

public class Demo {
	
	Demo(){
		System.out.println("constructor demo");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		Demo obj = new Demo();
		
		obj.displayNonst();
		Demo.displayStatic();
		Demo obj2 = new Demo();
		
	}
	
	public static void displayStatic()
	{
		System.out.println("stastic method");
	}
	
	public void displayNonst()
	{
		System.out.println("non static method");
	}
	
	static
	{
		System.out.println("Static block");
		
	}
	
	
	{
		System.out.println("nonStatic block");
		
	}
	

}
