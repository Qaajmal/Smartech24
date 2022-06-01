package com.ajmal;

public class Palindrome {
// *** This is a one of the most common and important code in Java and for interview nowadays

	static boolean isPalindrome(String str) {
	int i = 0, j = str.length() - 1;
	while (i<j) {
		// str.lengthh()-1 this minus 1 is used match the length with index number as index starts with zero
		// while is loop inside this loop there is boolean value true or false
		if(str.charAt(i) !=str.charAt(j))
			return false;
		i++;
		j--;
	
	}
	return true;
}
//Here main method starts
public static void main(String[] args) {
	String abc = "102";
	//this method tolowerCase will change the whole word Jahid into lowercase. 
	abc = abc.toLowerCase();
	if (isPalindrome(abc))
		System.out.println("This is a palindrome");
	else
		System.out.println("This is not a palindrome");
}
}

//Palindrome with 'FOR' loop

//public static void main(String[] args) {
//
//String rev1= "MOmi";
//
////System.out.println("Enter a string  "+rev1);
//
//String count="";
//
//for (int i =rev1.length()-1; i>=0; i--)
//	
////***the for loop is reversing the 'Mom' word taking it from 
////rev1 string and store it in a new string count.
//	count=count+rev1.charAt(i);
//
//if(rev1.equalsIgnoreCase(count))
//	
//	System.out.println(rev1+" is a palindrome");
//else 
//	System.out.println(rev1+ " is not a plandrome");
//}
//}