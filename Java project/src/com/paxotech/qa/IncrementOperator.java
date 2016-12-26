package com.paxotech.qa;

public class IncrementOperator {
	
	public static void main(String[] args) {
		
		int x = 10;
		x++;
		System.out.println("This is called pre-increment operator :  " + x);
		
		
		int y = 10;
		System.out.println("This is called post-increment operation : " +y++);
		System.out.println(y);
		
		
		int z =10;
		z*=5; //z=z*5
		System.out.println("This is muliplication : " +z);
		
		int k =10;
		k/=5; //k=k*5
		System.out.println("This is division : " +k);
	
	}

}
