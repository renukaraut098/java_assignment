package com.method_prctice_one;

public class Check_EvenOdd {

	public static void main(String[] args) {
		
        test(985);
	}
	  public static void test(int num)
	  {
		  if((num/2)*2==num)
		  {
			 System.out.println("it is even");
			 return;
			 
		  }
		  else {
			  
			  System.out.println("it is odd");
		  }
	  }

}
