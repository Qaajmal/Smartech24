package com.ajmal;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> abc = new ArrayList<Integer>();
		
		
		
		abc.add(56);
		abc.add(509);
		abc.add(53);
		abc.add(53);
		abc.add(13);
		abc.add(90);
		
		int a = abc.size();
		
		System.out.println("Before sorting: "+abc);
		
		Collections.sort(abc);
		
	System.out.println("After sorting: "+abc);
	
	System.out.println("After sorting: "+abc.get(a-2));
		

	}

}
