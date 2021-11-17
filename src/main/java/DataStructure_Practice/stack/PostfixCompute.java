/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.stack;

import java.util.Stack;

/**
 *
 * @author JAY PATEL
 */
/*'its not subtracting zero... It's subtracting the ASCII value of the character '0'.
                
                                    Doing so gives you an ordinal value for the digit, 
                                    rather than its ASCII representation.
                                    In other words, it converts the characters '0' through '9' to the numbers 0 
                                    through 9, respectively.*/
public class PostfixCompute {

    static int logic(String exp)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            if(Character.isDigit(c))
            {
                stack.push(c-'0'); //
            }else
            {
                int val1=stack.pop();
                int val2=stack.pop();
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                     
                    case '-':
                    stack.push(val2- val1);
                    break;
                     
                    case '/':
                    stack.push(val2/val1);
                    break;
                     
                    case '*':
                    stack.push(val2*val1);
                    break;
                }
            }
        } 
        return stack.pop();
    }
public static void main(String args[])
{
    String exp="231*+9-";
    
    System.out.println( " Value of "+exp+" is "+logic(exp));
}

}
