/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.string;

/**
 *
 * @author JAY PATEL
 */
public class ReverseWords {

public static void main(String args[])
{
    String str="jay is my name";
    
    String arrs[]=str.split(" ");
        
    int j=arrs.length-1;
   
    int i=0;
    
    while(i<j)
    {
       String temp=arrs[i];
       arrs[i]=arrs[j];
       arrs[j]=temp;
       i++;
       j--;
        }
    
    for(String s:arrs)
    {
        System.out.print(s +" ");
    }
    }
}

