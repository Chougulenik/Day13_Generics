package com.bridgelabz;

public class Maximum<E extends Comparable<E>> {
	
	private E[] myArray;
		Maximum(E[] myArray) {
		this.myArray = myArray;
	}
	
	public void maxElement() {
		for(int i=0; i<myArray.length-1; i++) {
			if(myArray[i].compareTo(myArray[i+1]) == 1) {
				myArray[i+1] = myArray[i];
			}
		}
		System.out.println(myArray[myArray.length-1]);
	}
}
