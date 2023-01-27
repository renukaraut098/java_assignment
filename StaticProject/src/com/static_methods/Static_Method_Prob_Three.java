package com.static_methods;

public class Static_Method_Prob_Three {
	
	static int a;

	public static void main(String[] args) {
		 
		a=9;
		System.out.println(a);
		
		double a=60;
		System.out.println(a);
		
		System.out.println(Static_Method_Prob_Three.a);
		test();
		
	}
	
	 public static void test()
	 {
		 char a='n';
		 System.out.println(a);
		 
		 System.out.println(Static_Method_Prob_Three.a);
		 
				 
	 }
}
	 


