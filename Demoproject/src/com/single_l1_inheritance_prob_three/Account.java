package com.single_l1_inheritance_prob_three;

public class Account {
	
	String name;
	String bank;
	String ifsc;
	long accno;
	String branch;
	
	public Account() {}

	public Account(String name,String bank,String ifsc,long accno,String branch)
	{
		this.name=name;
		this.bank=bank;
		this.ifsc=ifsc;
		this.accno=accno;
		this.branch=branch;
		
	}
	
		 public void displayAccount()
		 {
			 System.out.println(name);
			 System.out.println(bank);
			 System.out.println(ifsc);
			 System.out.println(accno);
			 System.out.println(branch);
			 System.out.println("=========================");
			 
		 }
	}