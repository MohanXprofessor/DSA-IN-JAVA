package com.bubbleSort;

import java.util.Scanner;

public class Bubblesortwithfunction {

    // Bubble Sort Logic with Function
	
    public static void bubbleSort(int[] my_array) {
        int n = my_array.length;
        boolean swapped; // flag used to break

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
            	
                if (my_array[j] > my_array[j + 1]) {
                	
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
    }

    
    
    
    
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int arrsize = scan.nextInt();

        // Create dynamic array as per user input size
        int[] my_array = new int[arrsize];

        // Storing user input
        for (int i = 0; i < arrsize; i++) {
            System.out.println("Enter Array Element:");
            my_array[i] = scan.nextInt();
        }

        // Displaying user input
        System.out.println("Entered Array is:");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("\t" + my_array[i]);
        }

        // Calling the bubbleSort function
        bubbleSort(my_array);

        // Display sorted array
        System.out.println("\nSorted Array is:");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("\t" + my_array[i]);
        }

        scan.close(); // Closing the scanner to prevent resource leak
    }
}
