package com.encapsulation_prob_one;

public class Account {
	private String bank;
	private String name;
	private int pin;
	private String email;
	private double balance;
	
   public String getBank()
   {
	   return bank;
   }
   
     public String getName()
     {
    	 return name;
    	 
     }
     public void setPin(int oldpin,int newpin)
     {
    	if(oldpin==pin)
    	{
    		pin=newpin;
    	
    	System.out.println("pin updated");
    	}
     else 
     {
    	 System.out.println("incorrect pin");
     }
   }
      public String getEmail()
      {
    	  return email;
      }
      
      public void setEmail(String oldemail,String newemail)
       {
    	  if(oldemail==email)
    	  {
    		this.email=newemail;  
    		System.out.println("email updated");
    	  }
    	  else
    	  {
    		  System.out.println("incorrect email");
    	  }
       }

public
	

}
