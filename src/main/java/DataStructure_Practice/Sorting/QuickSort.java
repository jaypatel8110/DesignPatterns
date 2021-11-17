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
public class QuickSort {

     void sort(int arr[] ,int low,int high)
     {
         if(low<high)
         {
             int pi=partion(arr,low,high);
             sort(arr,low,pi-1);
             sort(arr,pi+1,high);
         }
     }
     
     int partion(int arr[],int low,int high)
     {
         int i=(low-1);
         int pivote=arr[high];
         for(int j=low;j<high;j++)   //change when element is greater than pivote  with  i and increament i 
         {
             if(arr[j]<=pivote)
             {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
             }
         }
           int temp=arr[i+1];
           arr[i+1]=arr[high];
           arr[high]=temp;
           return i+1;
     }
     
     void print(int arr[],int n)
     {
         for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
     }
public static void main(String args[])
{
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n=arr.length;
    QuickSort q= new QuickSort();
    
    System.out.println("Before printing");
    q.print(arr, n);
    q.sort(arr,0,n-1);
    System.out.println("After printing");
    q.print(arr, n);
    
    System.out.println("FInd 4ht smallest ");
    int k=4;
    
//    int i;
//    for(i=n;i>k-1;i--)
//    {
//      i--;  
//    }
//     System.out.println("smallest element is "+arr[i]);
}

}
