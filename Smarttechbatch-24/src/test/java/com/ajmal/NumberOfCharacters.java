package com.ajmal;

public class NumberOfCharacters {

	public static void main(String[] args) {
	String abc = "United States of America";
	String x = abc.toLowerCase();
	System.out.println(x.charAt(4));
	int count = 0;
	for (int i =0; i<x.length();i++) {
		if (x.charAt(i)=='e') {
			count++;
		}
	}
		
		System.out.println(count);		
	}	
	}
	//String abc = "United States of America";
//
//String x = abc.toLowerCase();
//
//System.out.println(x.charAt(4));
//
//int count=0;
//
//for (int i = 0; i<x.length(); i++) {
//	
//if(x.charAt(i)=='e') 
//	{
//	
//	count++;  }	
//}
//System.out.println(count);
//	}

//}
