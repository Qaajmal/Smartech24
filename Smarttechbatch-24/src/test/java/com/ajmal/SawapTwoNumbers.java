package com.ajmal;

public class SawapTwoNumbers {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		
		System.out.println("The value of a before sawp:"+a);
		System.out.println("The value of b before sawp:"+b);
		
		int c;
		c=a;
		a=b;
		b=c;
		
		/*b=b+a;//5+3=8
		a=b-a;//8-5=3
		b=b-a;//8-3=5*/
		
		
		
		System.out.println("The value of a after sawp:"+a);
		System.out.println("The value of b after sawp:"+b);
	}

}
