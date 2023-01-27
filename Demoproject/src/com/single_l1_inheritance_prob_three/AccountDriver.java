package com.single_l1_inheritance_prob_three;

public class AccountDriver {

	public static void main(String[] args) {
		
		SavingAccount a1=new SavingAccount("renuka","Axis","BN0056",98767627,"deccon",2000.00,100.00);
				
				a1.displaySaving();
				
				a1.displayAccount();
				
				Account a2=new Account("shivani","SBI","TY76",654444444,"sewagram");
						
						a2.displayAccount();
						

	}

}