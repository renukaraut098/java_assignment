package com.super_call;

public class College extends Univercity{
	String cname;
	int building;
	
	College(){}
	
	College(String uname,String location,String cname,int building)
	{
		super(uname, location);
		this.cname=cname;
		this.building=building;
	}
	
	public void displayC()
	{
		
		System.out.println(uname);
		System.out.println(location);
		System.out.println(cname);
		System.out.println(building);
	}
	
	

}
