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
public class InsertSorted {
    
    static int insert(int arr[],int key,int p ,int capacity)
    {
     if (p>capacity)
     {
         return p;
     }
     int i;
     for(i=p-1;(arr[i]>key && i>0);i--)//we will start from  last posotion and continue to shift i to next postion 
                                      
     {
      arr[i+1]=arr[i];
     }
     
     arr[i+1]=key;
     return p+1;
    }

public static void main(String args[])
{
    
    
    int arr[] = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 9;
        
    int capicity=arr.length;
    int key=6;
    int p=4;
      System.out.println("Before insertion");
        for(int i=0; i<p;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
     System.out.println(" ");
     
      System.out.println("after  insertion");
       
     p=insert(arr,key,p,capicity);
     
     for(int i:arr)
     {
     System.out.print(" "+i);    
     }
}

}
