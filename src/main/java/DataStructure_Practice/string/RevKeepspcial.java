/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.string;


public class RevKeepspcial 
{
    
     static boolean check(char x)
    {
        return((x>='A' && x<='X') || (x>='a' && x<='x'));
    }
    static void logic(char[] s)
    {
        int r=s.length-1;
        int l=0;
        
        while(l<r)
        {
            if(!check(s[l]))
            {
                l++;
            }
            else if(!check(s[r]))
            {
                r--;
            }else
            {
                swap(s,l,r);
                l++;
                r--;
            }
        }
        
    }
    
    static char[] swap(char[] s,int l , int r)
    {
        int temp=l;
        s[l]=s[r];
        s[r]=s[temp];
        return s;
        
    }

public static void main(String args[])
{
        String str= "My.%.nam.^e.is.jay";
        char []s=str.toCharArray();
        logic(s);
        for(char x:s)
        {
            System.out.print(x);
        }
    }


}
