package com.early_relationshil__prob_one;

public class Engine {
	String fuel;
	int cc;
	double bhp;
	String type;
	int no_cy;
	
	public Engine() {};
	
	public Engine(String fuel,int cc,double bhp,String type,int no_cy)
	{
		this.fuel=fuel;
		this.cc=cc;
		this.bhp=bhp;
		this.type=type;
		this.no_cy=no_cy;
		System.out.println("engine created");
	}
	 public void displayEngine()
	 {
		 System.out.println(fuel);
		System.out.println(cc);
		System.out.println(bhp);
	    System.out.println(type);
	    System.out.println(no_cy);
	    System.out.println("=========================_");
	 }
	
	

}
