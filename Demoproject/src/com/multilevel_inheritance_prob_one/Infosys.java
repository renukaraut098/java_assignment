package com.multilevel_inheritance_prob_one;

public class Infosys extends SoftwareCompany
{
	
	String type;
	int projects;
	int employee;
	double turnover;
	
   public Infosys() {
	   
   }
   
   public Infosys(String type,int projects,int employee,double turnover)
   {
	   
	   this.type=type;
	   this.projects=projects;
	   this.employee=employee;
	   this.turnover=turnover;
   }
   
    public void displayInfosys() 
    {
       System.out.println(type);
	   System.out.println(projects);
	   System.out.println(employee);
	   System.out.println(turnover);
	   System.out.println("=========================");
	   
   }
	

}

