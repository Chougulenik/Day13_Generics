package com.bridgelabz;

public class Maximum<E extends Comparable<E>> {
	
	private E[] intArray;
	Maximum(E[] intArray) {
		this.intArray = intArray;
	}
	
	public void maxElement() {
		for(int i=0; i<intArray.length-1; i++) {
			if(intArray[i].compareTo(intArray[i+1]) == 1) {
				intArray[i+1] = intArray[i];
			}
		}
		System.out.println(intArray[intArray.length-1]);
	}
}
