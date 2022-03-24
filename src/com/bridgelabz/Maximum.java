package com.bridgelabz;


public class Maximum<T extends Comparable<T>> {
	T x, y, z;
	public Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	private static <T extends Comparable> void getMaximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(a) > 0) {
			max = b;
	    }
	    if (c.compareTo(max) > 0) {
	        max = c;
	    }
	    //print maximum no and string
	     System.out.println("Maximum :" + max);
	}
	
	public void max() {
		Maximum.getMaximum(x, y, z);
	 }
}
