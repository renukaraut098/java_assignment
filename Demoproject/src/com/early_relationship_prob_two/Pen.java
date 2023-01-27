package com.early_relationship_prob_two;

public class Pen {
	String shape;
	double price;
	String brand ;
	String name;
	
	Ink i1=new Ink(5,7,"pink",20 );
	
	Pen(){}
	
	Pen(String shape,double price,String brand,String name)
	{
		this.shape=shape;
		this.price=price;
		this.brand=brand;
		this.name=name;
		
		System.out.println("pen created");
	}
		
		public void displayPen()
		{
			System.out.println(shape);
			System.out.println(price);
			System.out.println(brand);
			System.out.println(name);
		}
		
	}
	
	
	


