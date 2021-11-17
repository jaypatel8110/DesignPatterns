/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.Sorting;

/**
 *
 * @author JAY PATEL
 * max heap method
 */
public class HeapSort {

    static void print(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public void sort(int arr[])
    {
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--)//for second last level in tree
        {
            heapify(arr, n, i);
        }
//        now one by one remove element and add in array
    for(int i=n-1;i>=0;i--)
    {
        int temp=arr[0];
        arr[0]=arr[i];//swap first and last element
        arr[i]=temp;
        
        heapify(arr, i, 0);//call max heap with new values of n //0 is index and i is size
    }
    }
    void heapify(int arr[], int n, int i)
    {
        int largest=i;//root
        int l=2*i+1;//left
        int r=2*i+2;//right
        
        if(l<n && arr[l]>arr[largest])
        {
            largest=l;
        }
        if(r<n && arr[r]>arr[largest])
        {
            largest=r;
        }
        if(largest!=i)//if largest is changed in above function than need to swap the root
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
                    
        }
        
    }
public static void main(String args[])
{
    int arr[]={12, 11, 13, 5, 6, 7  };
    int n = arr.length;
    System.out.println("Before sorting");
    print(arr);
    System.out.println("after sorting");
    HeapSort heap=new HeapSort();
    heap.sort(arr);
    print(arr);
    
}

}
