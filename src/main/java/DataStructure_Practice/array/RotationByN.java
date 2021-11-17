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
//rotate by given n numbers
public class RotationByN {

    void logic(int arr[],int num,int size)
    {
        int i;
        for(i=0;i<num;i++)
        {
            logic2(arr,size);
        }
    }
    void logic2(int arr[],int n)
    {
        int i,temp;
        temp=arr[0];
        for(i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
        
    }
    
    void print(int arr[],int n)
    {
         int i;
        for (i = 0; i <n; i++)
            System.out.print(arr[i] + " ");
    }
public static void main(String args[])
{
    RotationByN R=new RotationByN();
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int num=2;
    int size=arr.length;
    R.logic(arr,num,size);
    R.print(arr,size);
}

}
