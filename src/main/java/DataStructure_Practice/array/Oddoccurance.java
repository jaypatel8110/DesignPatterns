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
public class Oddoccurance {
    
    int logic(int arr[],int size)
    {
       int i;
       int res=0;
       for(i = 0; i < size; i++)
       {
           res=res^arr[i];
       }
    
       return res;
    }
    // A^A=0 // so for even number of times it will be 0 XOR operation
    // A^0=A // odd number 
    //0010^0011 = 0001

public static void main(String args[])
{
    Oddoccurance occ=new Oddoccurance();
    int arr[]={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
    int size=arr.length;
    System.out.println(occ.logic(arr,size));
    
}

}
