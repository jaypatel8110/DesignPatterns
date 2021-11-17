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
public class DoublyLinkedlist {
    
    static Node head;
    class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data) 
        {
            this.data=data;
            next=null;
            prev=null;
        }
         
    }
    
    void push(int data) //to push the data normal function
    {
        Node new_node=new Node(data);
        new_node.next=head;
        new_node.prev=null;
        
        if(head!=null)//if it is not the first node
        {
            head.prev=new_node;
        }
        head=new_node;
    }
    
    void insetAfter(Node prev_node,int data)//insert after given node
    {
        if(prev_node==null)
            System.out.println("must have atleast one element");
        
        Node new_node=new Node(data); 
        
        new_node.next=prev_node.next; 
       
        new_node.prev=prev_node;
        
        prev_node.next=new_node;
        
        if(new_node.next!=null)
        {
            new_node.next.prev=new_node;
        }
        
    }
    void append(int data)//add at end
    {
        Node new_node=new Node(data);
        
        Node last=head;
        
        if(head==null)
        {
            new_node.prev=null;
            head=new_node;
            return;
        }           
        while(last.next!=null) //get the last element
            last=last.next;
        
        last.next=new_node;
        new_node.next=null;
        new_node.prev=last;
    }
    void print(Node node)
    {
        Node last=null;
         System.out.println("Traversal in forward Direction");
         while(node!=null)
         {
             last=node;
             System.out.print(node.data+" ");
             node=node.next;
         }
          System.out.println("Traversal in reverse Direction");
          while(last!=null)
          {
              System.out.print(last.data+" ");
              last=last.prev;
          }
    }

public static void main(String args[]){
    
    DoublyLinkedlist d=new DoublyLinkedlist();
    d.push(0);
    d.push(1);
    d.push(2);
    d.push(3);
    d.push(4);
    d.print(head);
    
        
}

}
