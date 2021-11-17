/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.string;

import java.util.Arrays;

/**
 *
 * @author JAY PATEL
 */
public class RemoveDup {
    
    static String logic(String str)
    {
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
       // System.out.println(arr);
        str=new String(arr);
         return  logic2(str);
    }
    static String logic2(String str)
    {
        char arr[]=str.toCharArray();
        int p=1,q=1;
        while(p<arr.length)
        {
            if(arr[p]!=arr[p-1])
            {
                arr[q]=arr[p];
                q++;
            }
            p++;
        }
        str=new String(arr);
       return str.substring(0,q);
    }

public static void main(String args[])
{
    String str="jaay is king";
    System.out.println(logic(str));
}

}
