package com.infotect;

public class SelectionSort {
	
	public static void bubbleSort(int arr[]) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			int min=i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
	}



	private static void swap(int[] arr, int j, int k) {
		int temp=arr[j];
		arr[j]=arr[k];
		arr[k]=temp;
	}
	
	

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
		 for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	    }
		
	}


