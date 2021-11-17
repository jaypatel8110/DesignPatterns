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
public class MinAbsSumPair {
     static void logic(int a[],int n)
     {
         int sum,min_sum=99999;
         int l=0, r=n-1;
         int min_l=l,min_r=r;
         
         if(n<2)
         {
         System.out.println("Should have minimum two elements");
         }
         sort(a,l,r);
         
         while(l<r)
         {
             sum=a[l]+a[r];
             if(Math.abs(sum)<Math.abs(min_sum))
             {
                 min_sum=sum;
                 min_r=r;
                 min_l=l;
             }
             
             if(sum<0)
             {
                 l++;                
             }else{r--;}
         }
      
      System.out.println(" The two elements whose "+
                              "sum is minimum are "+
                        a[min_l]+ " and "+a[min_r]);
     }
public static void main(String args[])
{
    int arr[] = {1, 60, -10, 70, -80, 85};
    int n=arr.length;
    MinAbsSumPair.logic(arr,n);
}

static void sort(int a[],int min,int max)
{
    if(min<max)
    {
        int pi=partion(a,min,max);
        sort(a, min,pi-1);
        sort(a,pi+1,max);
    }

}
    static int partion(int a[],int min,int max)
    {
        int pivote=a[max];
        int i=min-1;
        for(int j=min;j<max;j++)
        {
            if(a[j]<=pivote)
            {
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[max];
        a[max]=temp;
        return i+1;
    }

}
