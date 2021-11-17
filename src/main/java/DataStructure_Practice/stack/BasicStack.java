/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.stack;


//Stack is last in first out
public class BasicStack {
    

public static void main(String args[])
{
    stack s=new stack();
    s.push(2);
    s.push(5);
    s.push(6);
    s.push(10);
   // System.out.println(" "+s.isEmpty());
    s.top();
    System.out.println("is poped "+s.pop());
    s.top();
}

}

class stack
{
    static final int max=1000;
    int top;
    int a[]=new int[max];

   
    boolean isEmpty()
    {
       return (top<0);
    }
    stack() 
    {
        top=-1;
    }
    boolean push(int x)
    {
        if(top>=max)
        {
            System.out.println("stack over flow");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println(" "+x+" is pushed");
            return true;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("stack under flow");
            return 0;
        }
        else
        {
           int x= a[top--];
           return x;
        }
    }
    void top()
    {
        System.out.println(a[top]+" is top");
    }
}

