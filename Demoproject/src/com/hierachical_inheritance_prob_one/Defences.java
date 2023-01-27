package com.hierachical_inheritance_prob_one;

public class Defences {
	String minister;
	String cds;
	double budget;
	int soldiers;
	
	public Defences() {}
	
	public Defences(String minister,String cds,double budget,int soldiers)
	{
		this.minister=minister;
		this.cds=cds;
		this.budget=budget;
		this.soldiers=soldiers;
		
	}
	
	 public void displayDefences()
	 {
		 System.out.println(minister);
		 System.out.println(cds);
		 System.out.println(budget);
		 System.out.println(soldiers);
		 System.out.println("==================================");
	 }
	
	

}
