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
public class BinarySearch {

    int search(int arr[],int l,int r,int key)
    {
        if(r>=l)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                return search(arr, l, mid-1, key);
            }
            return search(arr,mid+1, r, key);
        }
        return -1;
    }
public static void main(String args[]){

    BinarySearch s=new BinarySearch();
    int arr[]={2,3,4,10,40};
    int n=arr.length;
    int key=10;
    int result=s.search(arr,0,n-1,key);
    if(result==-1){

        System.out.println("No match found");
    }else{
     System.out.println("Found at postion "+result );   
    }
}

}
