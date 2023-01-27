package com.method_prctice_one;

public class Reverce_Prob_One {
	
	public static void main(String[]args)
	{
		rev(4567);
	}
	public static void rev(int num)
	{
        int reverse=0;
		while(num>0)
		{
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num/=10;
			
			System.out.println(reverse);
		}
	}
}
