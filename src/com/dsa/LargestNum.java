package com.dsa;
import java.util.*;

public class LargestNum {

	 public int largestNum(int arr[]) {
		 int largest = Integer.MIN_VALUE ;
		 
		 for(int i=0; i<arr.length;i++) {
			 
			 if(arr[i]>largest) {
				 
				 largest = arr[i];
			 }
			 
		 }
		 
		 return largest;
		 
	 }
	
	
	
	
	
}
