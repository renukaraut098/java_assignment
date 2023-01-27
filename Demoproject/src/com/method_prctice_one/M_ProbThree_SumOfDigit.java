package com.method_prctice_one;

public class M_ProbThree_SumOfDigit {

	public static void main(String[] args) {
		
		sum(12345);
		}
	
	 public static void sum(int num)
	 {
		 int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=rem+sum;
			num/=10;
		}
		
		System.out.println(sum);
			
			}
		
}
