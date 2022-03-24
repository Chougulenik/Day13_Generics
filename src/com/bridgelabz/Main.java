package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		
		Integer a = 20, b = 50, c = 80;
	    Float p = 20.85f, q = 90.55f, r = 80.98f;
	    String e = "Apple", f = "Peach", g = "Banana";
	  
		new Maximum<>(a, b, c).max();
		new Maximum<>(p, q, r).max();
		new Maximum<>(e, f, g).max();
	}

}
