package com.test.cue1;
import java.util.*;
public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		
		for(Integer num: list){
			System.out.println(num);
		}
		
		
		System.out.println("After remove items");
	    
		list.remove(1);
		
	    for(Integer num: list){
			System.out.println(num);
		}
		

	}

}
