package com.infotect;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++) {
				System.out.println(+i);
				int k=j+1;
				if(arr[j]>arr[k]) {
					swap(arr, j,k);
				}
			}
		}
		
	}



	private static void swap(int[] arr, int j, int k) {
		int temp=arr[j];
		arr[j]=arr[k];
		arr[k]=temp;
	}
	
	public static int jumpSearch(int[] arr, int x) 
    { 
        int n = arr.length; 
  
        // Finding block size to be jumped 
        int step = (int)Math.floor(Math.sqrt(n)); 
  
        // Finding the block where element is 
        // present (if it is present) 
        int prev = 0; 
        while (arr[Math.min(step, n)-1] < x) 
        { 
            prev = step; 
            step += (int)Math.floor(Math.sqrt(n)); 
            if (prev >= n) 
                return -1; 
        } 
  
        // Doing a linear search for x in block 
        // beginning with prev. 
        while (arr[prev] < x) 
        { 
            prev++; 
  
            // If we reached next block or end of 
            // array, element is not present. 
            if (prev == Math.min(step, n)) 
                return -1; 
        } 
  
        // If element is found 
        if (arr[prev] == x) 
            return prev; 
  
        return -1; 
    } 

	public static void main(String[] args) {
		/*int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
		 for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	        
	        
	        
	    }*/
		  
		  
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
                34, 55, 89, 144, 233, 377, 610}; 
    int x = 55; 
    int step = (int)Math.floor(Math.sqrt(arr.length)); 
    int i = arr[Math.min(step, arr.length)-1];
System.out.println(arr.length+" + "+i);
    // Find the index of 'x' using Jump Search 
    int index = jumpSearch(arr, x); 

    // Print the index where 'x' is located 
    System.out.println("\nNumber " + x + 
                        " is at index " + index);
	
	
		
	}

}
