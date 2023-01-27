package com.early_relationshil__prob_one;

public class Car {
	String brand;
	String color;
	String name;
	double price;
	int mileage;
	 
	Engine e1=new Engine("petrol",1500,134,"4 stroke",4);
	
	public Car() {};
	
	Car(String brand,String color,String name,double price,int mileage)
			{
		this.brand=brand;
		this.color=color;
		this.name=name;
		this.price=price;
		this.mileage=mileage;
		
		System.out.println("car created");
			}
	 public void displayCar()
	 {
		 System.out.println(brand);
		 System.out.println(color);
		 System.out.println(name);
		 System.out.println(price);
		 System.out.println(mileage);
	 }
}
		
			
			
	


