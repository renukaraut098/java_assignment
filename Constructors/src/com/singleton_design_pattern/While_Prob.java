package com.singleton_design_pattern;

import java.util.Scanner;

public class While_Prob {
	
	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a limit");
   int a=sc.nextInt();
	System.out.println("enter a break");
    int b=sc.nextInt();
    
     int i=1;
      
      while(i<=a)
      {
    	  System.out.println(i);
    	  if(i==b)
    	  {
    		  System.out.println("match");
    	  
    	  break;
    	  }
    	  
    	  {
    	  
    	  i++;
      }
      
      }
	}
}
      
  		
    	  
	

	 
	
	

     
	










