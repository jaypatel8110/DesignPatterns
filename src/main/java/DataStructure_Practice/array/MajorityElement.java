/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
A majority element in an array A[] of size n is an element that 
appears more than n/2 times (and hence there is at most one such element).
*/
package DataStructure_Practice.array;


/**
 *
 * @author JAY PATEL
 */
public class MajorityElement {

    
   void  logic(int a[],int size)
   {
        int cand=findmajority(a,size);
        
        //now to find if the majority element repeate more than n/2 times
        if(ismajority(a,size,cand))
        {
            System.out.println(" " + cand + " ");
        }
        else
        {System.out.println("No Majority Element");        }
        
   }
    
   int findmajority(int a[],int size)
   {
       int maj=0,count=1;
       int i=0;
       for (i=0;i<size-1;i++)
       {
           if(a[maj]==a[i])
           {
               count++;
           }
           else
           {
               count--;
           }
           if(count==0)
           {
              maj=i;
              count=1;
           }
       }
       return a[maj];
   }
    
   boolean ismajority(int a[],int size,int cand)
   {
       int i,count=0;
       for(i=1;i<size;i++)
       {
           if(a[i]==cand){count++;}
       }
        if (count > size / 2) 
            return true;
        else
            return false;
   }
public static void main(String args[])
{
    MajorityElement me=new MajorityElement();
    int a[]=new int[]{1, 3, 3,3,3,1, 2};
    int size=a.length;
    me.logic(a,size);
}

}
