/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.linkedlist;

/**
 *
 * @author JAY PATEL
 */
public class BasicLinkedList {
    
    static  Node head;
     static class Node
    {
        int data;
        Node next;
        Node(int d) //constructor
        {
            data=d;
            next=null;
        }  
     }
   static public void push(int new_data)//for push function
    {
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;   
    }
       static public void prin()// for printing 
        {
            Node n=head;
            while(n!=null)
            { System.out.print(n.data+" ");
              n=n.next;
            }
             System.out.println();
        }

public static void main(String args[])
{
  
    push(2);
   push(4);
    push(5);
   push(8);
   push(9);
    prin();
   
    
}


}
