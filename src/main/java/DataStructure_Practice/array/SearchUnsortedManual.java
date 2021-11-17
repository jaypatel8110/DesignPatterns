/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Practice.array;

import java.util.Scanner;

/**
 *
 * @author JAY PATEL
 */
public class SearchUnsortedManual {
    
   static int search(int arr[],int l,int key)
    {
        for(int i=0;i<l;i++)
        {
           if(arr[i]==key)
           {
               return i;
           }
        }
        return -1;
            
    }
    
    
    
    public static void main(String args[])
    {
        int arr[]={10,20,30,40};
        int l=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key to search");
        int key=sc.nextInt();
        int postion=search(arr,l,key);
        
        if(postion==-1)
        {
            System.out.println("key not found");
            
        }else
        {
            System.out.println("Key is at "+ (postion+1));
        }
        
    }
    
}
