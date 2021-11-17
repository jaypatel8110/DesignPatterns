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
public class Intersection {
    
    static void logic(int arr1[], int arr2[], int m, int n)
    {
        int i=0,j=0;
        //only print when both are equal
        while(i<m && j<n)
        {
            if(arr1[i]<arr2[j])
            {
               i++;
            }
        else if(arr2[j]<arr1[i])
            {
                
                j++;
            }
            else{ 
                System.out.print(arr2[j++]+" ");
                i++;
              }
        }
        
    }

public static void main(String args[])
{
     int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int m = arr1.length;
        int n = arr2.length;
        logic(arr1,arr2,m,n);
}

}
