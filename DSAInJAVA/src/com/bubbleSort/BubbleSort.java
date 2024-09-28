package com.bubbleSort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter Array Size :");
		int arrsize=scan.nextInt();
		
		// array create dynamic as per user input size of array
		
		int my_array[]=new int[arrsize];
		
//		Storing user input
		
		for(int i=0;i<arrsize;i++) {
		System.out.println("Enter Array Element :");
			my_array[i]=scan.nextInt();
		}
		
//		Displaying User input
		System.out.println("Enter Array is");
		for(int i=0;i<arrsize;i++) {
			System.out.print("\t"+my_array[i]);
				
			}
		
		
		
//		Bubble Sort Logic 
		 
//		 to find length of array
		
		 int n = my_array.length;
		 
	        boolean swapped; // flag used to break 
	        
	        
	        for (int i = 0; i < n - 1; i++) {
	        	
	            swapped = false;
	            
	            for (int j = 0; j < n - i - 1; j++)
	            {
	                if (my_array[j] > my_array[j + 1])
	                {
	                    // Swap arr[j] and arr[j + 1]
	                	
	                    int temp = my_array[j];
	                    
	                    my_array[j] = my_array[j + 1];
	                    
	                    my_array[j + 1] = temp;
	                    
	                    swapped = true;
	                }
	            }
	            // If no two elements were swapped in the inner loop, break
	            if (!swapped) break;
	        }
	        
	        System.out.println();
//	        To Display Sorted Array
	        System.out.println("Sorted Array is :");
			for(int i=0;i<arrsize;i++) {
				System.out.print("\t"+my_array[i]);
					
				}
	       
		
		

	}

}
