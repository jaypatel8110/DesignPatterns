/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.array;

/**
 *
 * @author JAY PATEL
 */
public class Quicksort {
    
    int partition(int arr[],int low ,int high)
    {
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        } 
        int temp=arr[i+1]; //for swaping of last element
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
        
    }
    
   void sort(int arr[], int min, int max)
   {
       if(min<max)
       {
           int pi=partition(arr,min,max);
           
           sort(arr,min,pi-1);
           sort(arr,pi+1,max);//will pass last and second last to swap
       }
    }
   
   static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
   
    

public static void main(String args[])
    {
    int arr[]={11,2,5,50};
    int size=arr.length;
    
    Quicksort q= new Quicksort();
    q.sort(arr,0,size-1);
         
    System.out.println("sorted array is ");
    printArray(arr);
        
    }
}


