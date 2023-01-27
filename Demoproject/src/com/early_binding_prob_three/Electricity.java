package com.early_binding_prob_three;

public class Electricity {
	
	double bill;
	long tower;
	String phases;
	
	 Refrigeratar r1=new  Refrigeratar(2500.0,"mediun","blue");
	 
	 Refrigeratar r2=new  Refrigeratar(3000.0,"high","red");
	 
	 Electricity () {}
	 
	 Electricity(double bill,long tower,String phases)
	 {
		 this.bill=bill;
		 this.tower=tower;
		 this.phases=phases;
	 }
	   public void displayE()
	   {
		   System.out.println(bill);
		   System.out.println(tower);
		   System.out.println(phases);
		   System.out.println("===================");
	   }
    
}
