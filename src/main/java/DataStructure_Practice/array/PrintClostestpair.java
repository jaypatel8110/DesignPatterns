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
//print values that are cloest to given sum
public class PrintClostestpair {

    static void logic(int arr[],int n,int x)
    {
        int f_l=0,f_r=0;
        
        int diff=Integer.MAX_VALUE;
        int l=0,r=n-1;
        while(l<r)//to make sure we dont reach the end
        {
         if(Math.abs(arr[r]+arr[l]-x)<diff)//if difference is less then priv then only go through
         {
             f_r=r;
             f_l=l;
             diff=Math.abs(arr[r]+arr[l]-x);
         } 
         if(arr[r]+arr[l]<x)
         {
            l++;
         }else
         {r--;}
        }
        System.out.println("closest elements are "+arr[f_l]+" and "+arr[f_r]);
        
    }
public static void main(String args[])
{
    int arr[]={10, 22, 28, 29, 30, 40};
    int x=54;
    int n=arr.length;
    
    logic(arr,n,x);
}

}
