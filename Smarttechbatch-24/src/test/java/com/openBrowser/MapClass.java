package com.openBrowser;

import java.util.HashMap;
import java.util.Hashtable;

public class MapClass {

	public static void main(String[] args) {
		
		HashMap<String, Integer> abc = new HashMap<String, Integer>();
		
		abc.put("Ajmal", 973836);
		abc.put("Sohaila", 983846);
		abc.put("Mahmood", 993947);
		abc.put("Sadia", 9732345);
		abc.put(null, 9742345);
		abc.put(null, 9752345);
		
		//HashMap can print or accept one null value 
		
		System.out.println(abc.get(null));
		
		Hashtable<String, Integer> xyz = new Hashtable<String, Integer>();
		
		xyz.put("Ruh", 973836);
		xyz.put("Nazir", 983846);
		xyz.put("Qamar", 993947);
		xyz.put("Haris", 9732345);
		xyz.put("Farid", 97423445);
		//xyz.put(null, null);
		
		//Hashtable is not printing any null value 
		//System.out.println(xyz.get("null"));
		
		
	}

}
