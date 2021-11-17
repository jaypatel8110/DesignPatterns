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
public class PairDifference {

    static boolean logic(int arr[],int x)
    {
        int i=0,j=1;
        int size=arr.length;
        while(i<size && j<size)
        {
            if(i!=j && arr[j]-arr[i]==x)
            {
                System.out.println("Pair found " +arr[i] +" "+arr[j]);
                return true;
            }
            else if(arr[j]-arr[i]<x)
            {  j++;
            }
            else
            {
              i++;
            }
            
        }
        System.out.println("Pair not found");
        return false;
    }
    
    
public static void main(String args[])
{
    int arr[]={1, 8, 30, 40, 100};
    int n=60;
    logic(arr,n);
}

}
