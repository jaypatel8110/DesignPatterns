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
public class MissingElement {

    
     static int logic(int a[],int n)
    {
        int total=(n+1)*(n+2)/2; // formula is n*(n+1)/2 to find missing number in a sequence
        System.out.println("Total is "+total);
        for(int i=0;i<n;i++)
        {
            total-=a[i];
            System.out.println("Total = "+total);
            
        }
        return total;
    } 
            
public static void main(String args[])
{
    //MissingElement me =new MissingElement();
    int a[]={1,2,3,5};
    int size=a.length;
  // System.out.println(me.logic(a,size));
     System.out.println("Answer is "+logic(a,size));
   
}

}
