package com.single_i1_inheritance_prob_one;

public class ABDriver {
	public static void main(String[]args)
	{
		B b1=new B();
		b1.displayB();
		b1.displayA();
		System.out.println(b1.x);
		System.out.println(b1.d);
		
		A a1=new A();
		a1.displayA();
		System.out.println(a1.x);
				
	}



}
