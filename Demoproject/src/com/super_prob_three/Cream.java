package com.super_prob_three;

public class Cream {
	
	String quality;
	double price;
	 String quantity;
	
	 Cream(){}
	 Cream(String quality,double price,String quantity)
	 {
		 super();
			
		 this.quality=quality;
		 this.price=price;
		 this.quantity=quantity;
		
	 }
	 
	
	
	public void displayC()
	{
		System.out.println(quality);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println("==============");
	}

}
