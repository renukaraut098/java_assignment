package com.lazy_binding_prob_two;

public class Book {
	
	double cost;
	String color;
	String type;
	long pages;
	
	Book(){}
	
	Book(double cost,String color,String type,long pages)
	{
		this.cost=cost;
		this.color=color;
		this.type=type;
		this.pages=pages;
	}
	
	public void showBook()
	{
		System.out.println(cost);
		System.out.println(color);
		System.out.println(type);
		System.out.println(pages);
		System.out.println("====================");
		
	}

}
