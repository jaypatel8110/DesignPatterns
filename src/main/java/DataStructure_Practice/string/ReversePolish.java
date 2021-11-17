/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.string;

import java.util.Stack;

/**
 *
 * @author JAY PATEL
 */
public class ReversePolish {

    
    static int logic(String token[])
    {
        int returnval=0;
        String oprands="+-*/";
        
        Stack<String> stack=new Stack<>();
        for(String s:token)
        {
           if(!oprands.contains(s))
           {
               stack.push(s);
           }else
           {
               int i=Integer.valueOf(stack.pop());
               int j=Integer.valueOf(stack.pop());
               switch(s)
               {
                   case "+":
                       stack.push(String.valueOf(i+j));
                       break;
                   case "-":
                       stack.push(String.valueOf(i-j));
                       break;
                   case "*":
                       stack.push(String.valueOf(i*j));
                       break;
                   case "/":
                       stack.push(String.valueOf(i/j));
                       break;
                }
            }     
        }
        returnval=Integer.valueOf(stack.pop());
        return returnval;
    }
        
    public static void main(String args[])
    {
       String[] token=new String[]{"2", "1", "+", "3", "*"};
       System.out.println(logic(token));

    }

}
