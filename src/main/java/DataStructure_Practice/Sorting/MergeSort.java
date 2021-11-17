/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Practice.Sorting;

/**
 *
 * @author JAY PATEL
 * 
 */
public class MergeSort {

    void sort(int arr[], int l, int r) {
        if (l < r)//base condition to get out of loop
        {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r) {
        //sizes of two sub arrays
        int n1 = m - l + 1;
        int n2 = r - m;

        //temp array
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copying data to temp arrays
        for (int i = 0; i < n1;i++) {
            L[i] = arr[l + 1];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m+1+j];
        }

        //merging the temp arrays
        int i = 0, j = 0;
        int k = l;  
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) 
    {
         int arr[] = {12, 11, 13, 5, 6, 7};
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }

}
