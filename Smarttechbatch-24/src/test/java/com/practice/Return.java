package com.practice;

public class Return {

//	void go(){
//	int a=20;
//	System.out.println(a);
//	}
	
//	void noGo(){
//	int a=70;
//	System.out.println(a);
//	}
	 int go() {
	int a=20;
	return a;
	}
	
	 int noGo() {
     int a=70;
     return a;
     }
	public static void main(String[] args) {
//Now we using println method inside main method. 		
		Return obj = new Return ();
				System.out.println(obj.go()); 
				System.out.println(obj.noGo());
	}
	
}
//Return keyword finished the execution of a method, and can be use to return a value from or outside a method. 
// Using Parameter we can pass a value inside a method Using Return we can pass a value outside a method.