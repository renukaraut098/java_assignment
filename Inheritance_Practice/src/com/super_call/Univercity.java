package com.super_call;

public class Univercity {
	
	String uname;
	String location;
	
	Univercity(){}
	
	Univercity(String uname,String location){
		
		super();
		this.uname=uname;
		this.location=location;
	}
	
	public void displayU()
	{
		System.out.println(uname);
		System.out.println(location);
	}


}
