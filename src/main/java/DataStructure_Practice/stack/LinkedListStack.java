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
public class LinkedListStack {
    
    Node top;
    
    public void push(int data)
    {
        Node new_node=new Node(data);
        new_node.next=top;
        top=new_node;
    }
    public Node pop()
    {
        Node del=top;   
        top=top.next;
        return del;
    }
    
     public void display()
    {
        Node s = top;
        while (s != null) {
            System.out.print(" " + s.data);
            s = s.next;
        }
        System.out.println();
    }
   public void reverse()
   {
       Node next , prev =null;
       Node current=top;
       while(current!=null)
       {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       top=prev;
   }

public static void main(String args[])
{
    LinkedListStack stack=new LinkedListStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println("Original stack is ");
    stack.display();
    System.out.println("reverse stack is ");
    stack.reverse();
    stack.display();
    
    
}

}

class Node
   {
       int data;
       Node next;
       public Node(int data)
       {
           this.data=data;
           next=null;
       }
  }
