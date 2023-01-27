package com.static_methods;

public class Insta_Using_Constru_Class {
	 String name;
	 String location;
	 long phno;
	 String email;
	
	public Insta_Using_Constru_Class() {}
	
	public Insta_Using_Constru_Class(String name,String location,long phno,String mail)
	{
		this.name=name;
		this.location=location;
		this.phno=phno;
		email=mail;
		
	}
	
	public  void displayData() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(phno);
		System.out.println(email);
	}
}
	
	
			
	
	
