package com.dsa;

public class Main {

	
	public static void main(String args[]) {
		
		LargestNum obj = new LargestNum();
		
		int array[] = {11,22,33,44,55,66,77,80};
		int key = 80;
		//Linear Search
		System.out.println(LinearSearch.lSearch(array, key));
		
		//Binary search
		System.out.println(BinarySearch.binarySearch(array, key));
		
		//Largest Num in Array
		System.out.println(obj.largestNum(array));

		
	}
	
	
}

