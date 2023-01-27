package com.hierachical_inheritance_prob_one;

public class Navy extends Defences{
	String attack;
	String color;
	int batches;
	int bases;
	
	Navy(){}
	
	Navy(String attack,String color,int batches,int bases,String minister,double budget,String cds,int soldiers)
	{
		this.attack=attack;
		this.color=color;
		this.batches=batches;
		this.bases=bases;
		
		this.minister=minister;
		this.budget=budget;
		this.cds=cds;
		this.soldiers=soldiers;
		
	}
   public void displayNavy()
   
   {
	   System.out.println(attack);
	   System.out.println(color);
	   System.out.println(batches);
	   System.out.println(bases);
	   System.out.println("==================================");
   }
   
   
   }
