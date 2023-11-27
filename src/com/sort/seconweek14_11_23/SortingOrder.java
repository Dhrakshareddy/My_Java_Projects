package com.sort.seconweek14_11_23;

public class SortingOrder {

	//bubble sort
	public static void bubbleSort(int[]array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j+1];
					array[j+1]=array[j];
							array[j]=temp;	
				}
			}
		}
	}
	//selection sort
	static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }}
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
	//insertion sort
		static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n ; i++) {
	            int key = arr[i];
	           int j=i-1;
	           while(j>=0&&arr[j]>key) {
	        	   arr[j+1]=arr[j];
	        	   j--;
	           }
	           arr[j+1]=key;
	        }
	    }
	
	public static void main(String[] args) {
		int[]array= {13,44,67,12,14};
		// SortingOrder.bubbleSort(array);
		//SortingOrder.selectionSort(array);
		insertionSort(array);
		 for(int n:array) {
			 System.out.print(n+",");
		 }
	}

}
