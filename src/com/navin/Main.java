package com.navin;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int a[] = {5, 2, 7, 8, 3, 8, 6, 3, 2, 6 ,7};
		
		Bubbles bubbles = new Bubbles();
		Bubbles println = new Bubbles();
		
		bubbles.printDone();
		println.sort(a);
		
		
		System.out.println(Arrays.toString(a));
		
		
		/*	or you could do
		 
		  for(int i : a){
		  	System.out.println(i + " ");
		  }
		  
		 */
		
	}

}
