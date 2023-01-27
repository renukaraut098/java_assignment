package com.static_methods;

public class Static_Method_ProbTwo {
	
	static double a;

	public static void main(String[] args) {
		 System.out.println(a);
		 
		  a=3.8;
		  
		  System.out.println(a);
		  test();
		  System.out.println(a);
		  
	}
	public static void test()
	{
		System.out.println(a);
		
		 a=4;
		System.out.println(a);
		
	}
}
	
		 
		 
		
		

	


