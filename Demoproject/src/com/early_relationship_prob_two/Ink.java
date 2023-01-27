package com.early_relationship_prob_two;

public class Ink {
	int width;
	int height;
	String color;
	double cc;
	
	Ink(){}
	
	Ink(int width,int height,String color,double cc)
	{
		this.width=width;
		this.height=height;
		this.color=color;
		this.cc=cc;
		
		System.out.println("ink created");
	}
		
		public void displayInk()
		{
			System.out.println(width);
			System.out.println(height);
			System.out.println(color);
			System.out.println(cc);
		}
	}

	
	
	


