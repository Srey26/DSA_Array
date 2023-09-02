package com.dsa;
//For binary search to happen the array should in a sort form. 
// if you want to perform an binary search on unsort array then sort the array first then perform the binary search.


public class BinarySearch {

	public static int binarySearch(int arr[],int key) {
		int start =0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(arr[mid]== key) {
				return mid;
			}
			else if(key > arr[mid]) {
				start = mid +1;
			}else {
				end= mid -1;
			}
		}
		return  -1;
	}
	
}

