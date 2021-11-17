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
public class CircularTraversal {

    Node head; //declared here so that it can be visible to all

    public CircularTraversal() //default constructor is called once, heace when called head is initiallized to null
    {
        head=null;
    }
   
    void push(int data)
    {
         Node new_node=new Node(data); //make new node out of data
         Node current=head;
         new_node.next=head;
         
         if(current!=null)
         {
             while(current.next!=head) //traverse until reach the last node
             {
                 current=current.next;
             }
             current.next=new_node; //make next of last as new node and then make new node as head
         }else//if list is empty
         {
             new_node.next=new_node;
         } 
         
         head=new_node;
         
        
    }
    void print()
    {  
        if(head!=null)
        {
            Node temp=head;
            do
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            while(temp!=head);
        }
    }
public static void main(String args[])
{
    CircularTraversal c=new CircularTraversal();
    c.push(0);
    c.push(1);
    c.push(2);
    c.push(3);
    c.push(4);
    c.push(5);
    c.print();
    
}

}

class Node //function to create node
    {
        int data;
        Node next;
        public Node(int data) 
        {
            this.data=data;
            next=null;
        }
        
    }
