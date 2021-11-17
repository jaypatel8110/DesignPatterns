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
public class SortedInsertion {
    
    Node head;

    public SortedInsertion() 
    {
        head=null;
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
void push(int new_data)
{
    Node new_node=new Node(new_data);
    Node current=head;
   if(current==null) //when its the first element
   {
       new_node.next=new_node;
       head=new_node;
   }
   else if(current.data>=new_node.data)//if the node to inserted is smaller than the first element
   {
      while(current.next!=head)//to reach the last node of the list
          current=current.next;
     
      current.next=new_node;
      new_node.next=head;
      head=new_node;
   }
   else//when current data is greater 
   {
       while(current.next!=head && current.next.data<new_node.data) //loop until we find current greater then newnode
          current=current.next;
       new_node.next=current.next; //current is the data ie smaller than new_node
       current.next=new_node;
   }
}
void print()
{
    if(head!=null)
    {
        Node current=head;
        do
        {
            System.out.print(current.data+" ");
            current=current.next;
        }while(current!=head);
    }
}
public static void main(String args[])
{
    SortedInsertion s=new SortedInsertion();
    s.push(5);
     s.push(8);
      s.push(1);
       s.push(15);
        s.push(2);
        s.print();
    
}

}

