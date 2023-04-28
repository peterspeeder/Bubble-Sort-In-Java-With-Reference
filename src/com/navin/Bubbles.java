package com.navin;

public class Bubbles {
	public static void sort(int[] a)	{
		int len = a.length;
		boolean swapped;
		
		for(int i = 0; i < len - 1; i++) {
			swapped = false;
			
			for(int j = 0; j < len - i - 1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}
	public static void printDone() {
		System.out.println("Sort Complete.");
	}
}
