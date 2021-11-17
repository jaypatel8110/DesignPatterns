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
public class BinarySearch {
    
    static int bsearch(int arr[],int low,int high,int key) //we havew used static no need to create object of it
    {
        if(high<low)
        {
            return -1;
        }
        int mid=(low+high)/2;
        
        if(arr[mid]==key)
        {
            return mid;
        }
            if(key>arr[mid])
            {
            return bsearch(arr,(mid+1), high, key);
            }
            else
            {
                return bsearch(arr,low,(mid-1), key);
             }
    }

public static void main(String args[])
{
    
    int arr[]={2,4,6,8,10};
    int l=arr.length;
    int key=8;
    
    System.out.println("At index " + bsearch(arr,0,l,key));
}

}
