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
 * http://www.geeksforgeeks.org/insertion-sort/
 * 
 */
public class InsertionSort {

    static void sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];//current element 
            int j=i-1; //one element before to compare
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
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
    int arr[]={12, 11, 13, 5, 6};
    System.out.println("before sorting");
    printArray(arr);
    
    System.out.println("after sorting");
    sort(arr);
    printArray(arr);
}

}
