package com.super_prob_three;

public class FearInLovely extends Cream {
	
	 String size;
	 
	 FearInLovely(){}
	 
	 FearInLovely( String quality,double price,String quantity,String size)
	 
	 {
		 super();
		 this.size=size;
	 }
	 
	 public void displayF(String quality,double price,String quantity,String size)
	 {
		    System.out.println(quality);
			System.out.println(price);
			System.out.println(quantity);
			System.out.println(size);
			System.out.println("==============");
		}
	 

}
