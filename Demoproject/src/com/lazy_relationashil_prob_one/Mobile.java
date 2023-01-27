package com.lazy_relationashil_prob_one;

public class Mobile {
	String brand;
	String color;
	double price;
	int cam;
	Sim s1;
	
	Mobile(){}
	
	Mobile(String brand,String color,double price,int cam)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.cam=cam;
	}
	 public void insertSim(String service,String speed,long no)
	 {
		
         s1=new Sim(service,speed,no);
       
	  System.out.println("sim is inserted");
	 }
		
	
	   public  void displayMobile()
	   {
		   System.out.println(brand);
		   System.out.println(color);
		   System.out.println(price);
		   System.out.println(cam);
	   }
	
	}
	
	


