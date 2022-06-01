package com.ajmal;

public class Practice {
public static void main(String[] args) {
	String a = "United states of America";
	String x=a.toLowerCase();
	
	System.out.println(x.charAt(5));
	
	int count=0;
	
	for (int i=0; i<x.length();i++) {
		
		if(x.charAt(i)=='d') {
			count++;
		}
	}
	System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String rev1= "MOmi";
//	
//	//System.out.println("Enter a string  "+rev1);
//	
//	String count="";
//	
//	for (int i =rev1.length()-1; i>=0; i--)
//		
////***the for loop is reversing the 'Mom' word taking it from 
////rev1 string and store it in a new string count.
//		count=count+rev1.charAt(i);
//	
//	if(rev1.equalsIgnoreCase(count))
//		
//		System.out.println(rev1+" is a palindrome");
//	else 
//		System.out.println(rev1+ " is not a plandrome");
}
}
	
	


