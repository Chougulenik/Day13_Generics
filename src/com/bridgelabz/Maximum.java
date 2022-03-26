package com.bridgelabz;

public class Maximum<E extends Comparable<E>, U extends Comparable<U>, T extends Comparable<T>> {
	
	private E[] myArray;
	private U[] myArray1;
	private T[] myArray2;
	
	public Maximum(E[] myArray, U[] myArray1, T[] myArray2) {
		super();
		this.myArray = myArray;
		this.myArray1 = myArray1;
		this.myArray2 = myArray2;
	}

	public void maxElement() {
		for(int i=0; i<myArray.length-1; i++) {
			if(myArray[i].compareTo(myArray[i+1]) == 1) {
				myArray[i+1] = myArray[i];
			}
		}
		for(int i=0; i<myArray1.length-1; i++) {
			if(myArray1[i].compareTo(myArray1[i+1]) == 1) {
				myArray1[i+1] = myArray1[i];
			}
		}
		for(int i=0; i<myArray2.length-1; i++) {
			if(myArray2[i].compareTo(myArray2[i+1]) == 1) {
				myArray2[i+1] = myArray2[i];
			}
		}
		printMax();
	}

	private void printMax() {
		System.out.println(myArray[myArray.length-1]);
		System.out.println(myArray1[myArray1.length-1]);
		System.out.println(myArray2[myArray2.length-1]);
		
	}
}
