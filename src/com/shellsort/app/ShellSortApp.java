//Example or Shell Sort
package com.shellsort.app;

public class ShellSortApp {

    public static void main(String[] args) {

	    int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
	    
	    //Displaying Unsorted Array
	    System.out.println("--- Shell sort ---");
        System.out.println("Unsorted array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("[" + intArray[i] + "]");
        }
	    
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {


            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;

            }

        }
        
	    //Displaying Sorted Array
        System.out.println("\nSorted array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("[" + intArray[i] + "]");
        }
    }

}
