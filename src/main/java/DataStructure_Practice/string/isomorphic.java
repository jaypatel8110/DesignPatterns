/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.string;

import java.util.HashMap;

/**
 *
 * @author JAY PATEL
 */
public class isomorphic 
{
    static boolean logic(String s , String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        if(s==null || t==null)
        {
            return false;
        }
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        
        for(int i=0;i<s.length(); i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            Character c=map.get(c1);
            if(c!=null && c!=c2)
            {
                return false;
            }
            else
            {
                map.put(c1, c2);
            }
            
        }
        return true;
        
    }

public static void main(String args[])
{
    String s="add";
    String t="egg";
    System.out.println( logic(s, t));
    
}

}
