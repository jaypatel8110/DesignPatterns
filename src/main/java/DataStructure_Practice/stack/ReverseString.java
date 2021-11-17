/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.stack;

/**
 *
 * @author JAY PATEL
 */
public class ReverseString {
    static void reverse(StringBuffer str)
    {
     int n=str.length();
     stack1 stack=new stack1(n);
     int i;
     for(i=0;i<n;i++)
      {
          stack.push(str.charAt(i)); //first insert all normally in stack
      }
      for(i=0;i<n;i++)
      {
         char  c= stack.pop();
         str.setCharAt(i, c); //now pop one by one from stack and insert into string and last in first out so
                              //str is reversed
      }
      
    }

public static void main(String args[])
{
    StringBuffer s=new StringBuffer("jay");
    reverse(s);
    System.out.println("Reversed string is : " + s);
    
}
}


//function to create stack
class stack1
{
    int top;
    int size;
    char[]a;
    
    public stack1(int n) 
    {
      top=-1;
      size=n;
      a=new char[n];
    }
    boolean push(char c)
            {
                if(top>=size)
                    System.out.println("Stack overflow");
                else
                    a[++top]=c;
                    return true;
            }
    char pop()
    {
        if(top<0){   
            System.out.println("Stack underflow");
            return 0; 
        }
        else{
            char x=a[top--];
            return x;
           }
    }
    boolean isEmpty()
            {
                return(top<0); 
            }
    void top()
    {
       System.out.println(" "+top);
    }
        
}

