package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		
		Integer[] a = {1,4,3};
		Float[] b = {1.1f,2.2f,3.4f};
		String[] c = {"cat","dog","animal"};
		
		Maximum obj = new Maximum(a,b,c);	
		obj.maxElement();
	}
}
