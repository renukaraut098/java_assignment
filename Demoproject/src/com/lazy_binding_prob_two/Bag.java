package com.lazy_binding_prob_two;

public class Bag {
	String color;
	int chains;
	double price;
	String quality;
	
	Bag(){}
	
	Bag(String color,int chains,double price,String quality)
	{
		this.color=color;
		this.chains=chains;
		this.price=price;
		this.quality=quality;
	}
	
	 public void insertBook(double cost,String color,String type,long pages)
	 {
		 
	  Book b1 = new Book(cost,color,type,pages);
	  
	  System.out.println("book created");
	 }
	 
	 public void showBag()
	 {
		 System.out.println(color);
		 System.out.println(chains);
		 System.out.println(price);
		 System.out.println(quality);
		 System.out.println("===========");
	 }
	 

}
