package com.multilevel_inheritance_prob_one;

public class Engineer extends Infosys {
	
	String desination;
	String ename;
	int eid;
	double sal;
	
	 public Engineer() {
		 
	 }
	 
	 Engineer(String ceo,String location,String name,String type,int projects,int employee,double turnover, String desination,String ename,double sal,int eid)
	 {
		 this.ceo=ceo;
		 this.location=location;
		 this.name=name;
		 this.type=type;
		 this.projects=projects;
		 this.employee=employee;
		 this.turnover=turnover;
		 this.desination=desination;
		 this.ename=ename;
		 this.sal=sal;
		 this.eid=eid;
		 
	 }
	 
	  public void displayEngineer()
	  {
		  System.out.println(desination);
		  System.out.println(ename);
		  System.out.println(eid);
		  System.out.println(sal);
		  System.out.println("=========================");
	  }
		 

}
