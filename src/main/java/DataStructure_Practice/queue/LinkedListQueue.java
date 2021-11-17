/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.queue;

/**
 *
 * @author JAY PATEL
 */

class Node //method to make linked list
{
    int data;
    Node next;

    public Node(int data) 
    {
        this.data=data;
        this.next=null;
    }
    
}

public class LinkedListQueue {
    Node front,rear;

    public LinkedListQueue() //will call by default
    {
        this.front=this.rear=null;
    }
    
    void enqueue(int data)
    {
        Node temp=new Node(data);
        if(this.rear==null)
        {
            this.front = this.rear = temp;
            return;
        }
        
       this.rear.next=temp; //will push new elements as next unlike typical list
       this.rear=temp;//rear will point to last index
        
    }
    
    Node dequeue()
    {
        if (this.front == null)
           return null;
      
        Node temp=this.front;
        this.front=this.front.next; //move the index to next pointer
        
       // If front becomes NULL, then change rear also as NULL in case if it is last node
        if (this.front == null)
           this.rear = null;
        return temp;
    }
//    
//   void print()
//   {
//     Node print= front;
//     while(print.next!=rear)
//     {
//         System.out.print(print.data + " ");
//     }
//     System.out.println();
//   }
        
public static void main(String args[])
{
    LinkedListQueue queue=new LinkedListQueue();
    queue.enqueue(5);
    queue.enqueue(10);
    queue.enqueue(13);
    queue.enqueue(16);
    queue.enqueue(19);
//    queue.print();
    System.out.println("top is "+queue.dequeue().data);
}

}
