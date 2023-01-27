package com.lazy_binding_prob_two;

public class BBDriver {

	public static void main(String[] args) {
		
		Bag b2=new Bag("black",4,500.00,"good");
				
		b2.showBag();
		b2.insertBook(30.00, "white","binded book" , 400);
		b2.b1.showBag();
		
	}

}
