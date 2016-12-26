package com.test.cue1;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>();
		name.add("Rashed");
		name.add("Mishu");
		name.add("Mahfuz");
		
		Iterator <String> itr = name.iterator();
		
		while(itr.hasNext())
		{System.out.println(itr.next());}
		
	
		
		/*
		 HashSet<String> al=new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());}
		   
		*/
	}

}
