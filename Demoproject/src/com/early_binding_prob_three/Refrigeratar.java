package com.early_binding_prob_three;

public class Refrigeratar {
	
	double cost;
	String size;
	String color;
	
	 Refrigeratar(){}
	 
	 Refrigeratar(double cost,String size,String color)
	 {
		 this.cost=cost;
		 this.size=size;
		 this.color=color;
	 }
	 
	 public void displayR()
	 {
		 System.out.println(cost);
		 System.out.println(size);
		 System.out.println(color);
		 System.out.println("===========");
	 }
	

}
