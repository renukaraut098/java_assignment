package com.single_l1_inheritance_prob_three;

public class SavingAccount extends Account {
	
	double balance;
	double limit;
	
	public SavingAccount() {}
	
	public SavingAccount(String name,String bank,String ifsc,long accno,String branch,double balance,double limit)
	{
		this.name=name;
		this.bank=bank;
		this.ifsc=ifsc;
		this.accno=accno;
		this.branch=branch;
		
		this.balance=balance;
		this.limit=limit;
	}
		
		public void displaySaving()
		
		{
			System.out.println(balance);
			System.out.println(limit);
			System.out.println(name);
			System.out.println(bank);
			System.out.println(ifsc);
			System.out.println(accno);
			System.out.println(branch);
			System.out.println("============");
			
		}
	
	}
