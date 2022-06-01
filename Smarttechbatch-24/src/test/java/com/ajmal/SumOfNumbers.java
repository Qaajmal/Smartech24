package com.ajmal;

public class SumOfNumbers {

	public static void main(String[] args) {
		int [] a = {10,2,3,4,5,6,7,6,4,3,2,8,2};
		int sum = 12;
		
	for(int i = 0; i<a.length; i++) {
		
	for (int j = i+1; j<a.length; j++) {
		
		if ( a[i]+a[j]==sum) {
			
			System.out.println(a[i]+" and "+a[j]);
			
		}
	}
	}
		}
	}
		//		int [] a = {10,2,3,4,5,6,9,7,8,4,1};
//		
//		int sum =12;
//		
//		for (int i=0; i<a.length; i++) {
//			
//			for (int j=i+1; j<a.length; j++) {
//				
//				if (a[i]+a[j]==sum) {
//					System.out.println(a[i]+","+a[j]);
//				}
//			}
//		}
//
//	}
//
//}
