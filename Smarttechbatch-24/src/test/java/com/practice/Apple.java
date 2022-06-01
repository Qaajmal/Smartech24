package com.practice;

public class Apple {
	
	static int i = 10;
	static int j = 20;
	static int k = i+j;
	
	// *Parameter is a value that you can pass to a method in Java. 
	//As we did math outside method for parameter purpose we now can do it inside the method. 
	// We can pass int string boolean inside the parenthesis.
	
//	static void add(int a, int b) {
//		int l= a+b;
//		System.out.println("this is the result: "+l);
//		}
	
	static void add(int b, String a) {
		String l = b+a;
		System.out.println("this is the result: "+l);
	}
	public static void main(String[] args) {
		add(50," apple");
	}
	
	//* All these are outside of main method have to call it inside main method to run it. 	
		// * This main method is inside this class Apple. add method is a non static if want call it 
			// inside main method have to make it static or have to create object for it to call it 
			//inside main method as show in below lines. 

}

//*****public static void main(String[] args) {
		//Apple obj = new Apple ();
		//obj.add();	}
//*****This main method is inside the class Apple if want to call it I have to create an object of the 
// class if we don't want to create object of the class we have to make it static by adding static 
// in front of void. 