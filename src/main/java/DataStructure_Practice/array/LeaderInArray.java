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
public class LeaderInArray {
    
    void logic(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    break;
                } 
            }
            if(j==n)//i.e loop didint break
                {
                 System.out.print(" "+arr[i]);
                }
        }
        
    }

public static void main(String args[])
{
    LeaderInArray l=new LeaderInArray();
    int arr[] = new int[]{16, 17, 4, 3, 5, 2};
    int n = arr.length;
   
    l.logic(arr, n);
}

}
