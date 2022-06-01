package com.ajmal;

public class PrimeNumber {
	
	public static void main(String[] args) {
		for (int i =2; i<=100;i++) {
//		***	for loop has three parts first is initializing, second is conditioning 
//			and third is increment or decrement or decreasing 
		for(int j=2;j<=i;j++) {
			if (j==i) {
				System.out.println(i);
			}
			if(i%j==0) {break;}
		}	
		}
	}

}

//public static void main(string[] args) {
//	for(int i =2; i<=100; i++) {
//	for(int j =2; j<=i;j++) {
//	if(j==i) {
//		System.out.println(i);
//	}
//	if(i%j==0) {break;}	
//	}
//		
//	}
//}






















