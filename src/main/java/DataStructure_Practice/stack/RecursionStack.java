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
//using data structure 
public class RecursionStack {
    
    static public Stack<Character> st=new Stack<>(); //direct stack is used for push and pop
    
    static void reverse()
    {
        if(st.size()>0)
        {
            char x=st.peek();
            st.pop();
            reverse(); //go upto last element
            logic(x);
     }
    } 
    static void logic(char c)
    {
     if(st.empty())  //for first element
     {
         st.push(c);
     }else
     { //remove all the above and enter at end
         char a=st.peek();
         st.pop();
         logic(c);
         st.push(a);
     } 
     
    }
public static void main(String args[])
{
    st.push('1');
    st.push('2');
    st.push('3');
    st.push('4');
    System.out.println("original stack");
    System.out.println(st);
    
    //now to reverse
    reverse();
    System.out.println("revresed stack");
     System.out.println(st);
    
}

}
