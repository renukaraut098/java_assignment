package com.multilevel_inheritance_prob_one;

public class SoftwareCompany {
	
	String product = "software";
	String ceo;
	String location ;
	String name;
	
	public SoftwareCompany() {
		
	}
	
	public SoftwareCompany(String ceo,String location,String name)
	{
		
		this.ceo = ceo;
		this.location = location;
		this.name = name;
	}
	
	 public void displaySC()
    {
		 System.out.println(ceo);
		 System.out.println(location);
		 System.out.println(name);
		 System.out.println("=========================");
		
    }
	
	

}
