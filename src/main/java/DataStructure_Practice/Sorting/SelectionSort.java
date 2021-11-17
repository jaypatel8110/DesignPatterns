/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.Sorting;

/**
 *
 * @author JAY PATEL
 */
public class SelectionSort {
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    static void logic(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i; //index to hold min
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min]) //finding minimum
                {
                    min=j;
                }
            // Swap the found minimum element with the first
            // element and then increment i
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        
        }            
    
    }


public static void main(String args[])
    {
     int arr[] = {64,25,12,22,11};
     System.out.println("old array is");
     printArray(arr);
     
     System.out.println("new array is");
     logic(arr);
     printArray(arr);

    }
}
