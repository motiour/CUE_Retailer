package com.test.cue1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeHashMap = new TreeMap<Integer, String>();
	
	
		testMap(treeHashMap);
		
	}
		
		public static void testMap(Map <Integer,  String> map){
			
			
			map.put(1, "Rashed");
			map.put(5, "Dipti");
			map.put(3, "Roja");
			map.put(4, "Mahfuz");
			map.put(2, "Mishu");
			
			
			for(Integer key: map.keySet()){
				String value = map.get(key);
				System.out.println(key + ":" + value);
				//System.out.println(map.keySet());
			}
			
		}
		
		
	
		

	

}
