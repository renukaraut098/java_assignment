package com.static_methods;

public class Insta_Bio_Data {
	
	 static String name;
	 static String location;
	 static long phno;
	 
	 public static void main(String[] args) {
		 
		 
		 setName("renu");
		 setLocation("pune");
		 setPhno(97863767);
		 
		 setName("rameshwari");
		 
	}
	   public static void setName(String name)
	   {
		   Insta_Bio_Data.name=name;
		   System.out.println("name :"+name);
	   }
	   public static void setLocation(String loc)
	   {
		   location=loc;
		   System.out.println(location);
	   }
	   public static void setPhno(long phno)
	   {
		   Insta_Bio_Data.phno=phno;
		   System.out.println(phno);
	   }
	     
}

