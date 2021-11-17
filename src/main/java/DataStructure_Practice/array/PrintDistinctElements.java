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
//print values that are not repeated
public class PrintDistinctElements {

    static void logic(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<i;j++)
            {
                if(arr[j]==arr[i])
                {
                    break;
                }           
            }
            if(i==j)
                {
                    System.out.print(" "+arr[i]);
                }
        }
    }
    
public static void main(String args[])
{
    int arr[]={6, 10, 5, 4, 9, 120, 4, 6, 10};
    int n=arr.length;
    logic(arr,n);
}

}
