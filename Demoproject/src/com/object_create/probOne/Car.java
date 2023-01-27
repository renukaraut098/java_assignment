package com.object_create.probOne;

public class Car {

	String name;
	String email;
	long phno;
	long telno;
	char gender;

	Car(){}
	
	Car(String name,String email,long phno)
	{
		this.name=name;
		this.email=email;
		this.phno=phno;
	}
	
	
	Car(String name,String email,long phno,long telno)
	{
		this.name=name;
		this.email=email;
		this.phno=phno;
        this.telno=telno;
	}
	
	Car(String name,String email,long phno,long telno,char gender)
	{
		this.name=name;
		this.email=email;
		this.phno=phno;
        this.telno=telno;
        this.gender=gender;
	}
	   
	    public void displayDemo()
	 {
	    	System.out.println("name :"+name);
	        System.out.println("email :"+email);
	        System.out.println("phno :"+phno);
	        System.out.println("telno:"+telno);
	        System.out.println("gender:"+gender);
	        System.out.println("-------");
	 }
}
