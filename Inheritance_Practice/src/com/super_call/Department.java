package com.super_call;

public class Department extends College {
	
	String dname;
	
	String uname;
	
	Department(){}
	
	Department(String uname,String location,String cname,int building,String dname)
	{
		super(uname, location, cname, building);
		this.dname=dname;
	}
	public void displayD()
	{
		super.displayC();
		System.out.println(super.uname);
		System.out.println(location);
		System.out.println(cname);
		System.out.println(building);
		System.out.println(dname);
		System.out.println("=============");
	}

}
