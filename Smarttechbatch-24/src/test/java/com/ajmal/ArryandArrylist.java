package com.ajmal;

import java.util.ArrayList;
import java.util.Collections;

public class ArryandArrylist {
	
	public static void main(String[] args) {
	
		int [] abc = new int [4];
		
		abc[0]=10;
		abc[1]=20;
		abc[2]=68;
		abc[3]=54;
		//abc[4]=76
		int a = abc.length;
		
		System.out.println("this is the number for arry"+a);

		ArrayList<Integer> xyz = new ArrayList<Integer> ();
		
		xyz.add(10);
		xyz.add(20);
		xyz.add(68);
		xyz.add(54);
		xyz.add(98);
		System.out.println(xyz);
		
		Collections.sort(xyz);
		System.out.println(xyz);
		
		int b = xyz.size();
		System.out.println("this is the number for arrylist"+b);
	}
	

}
