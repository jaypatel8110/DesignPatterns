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
//queue is first in first out 
public class SimpleQueue {
    
    int front,rear,size;
    int capacity;
    int arr[];

    public SimpleQueue(int capacity) 
    {
        this.capacity=capacity;
        front=this.size=0;
        rear=capacity-1;
        arr=new int[this.capacity];
    }
    
    boolean isFull(SimpleQueue queue)
    {
        return(queue.size==queue.capacity);
    }
    boolean isEmpty(SimpleQueue queue)
    {   
        return(queue.size==0);
    }
    void enqueue(int item)
    {
        if(isFull(this))
        {
            System.out.println("full");
            return;
        }
        this.rear=(this.rear+1)%this.capacity; // initally will be zero bcos 4%4=0 then 1%4=1 , 2%4=2....
        this.arr[this.rear]=item; //and rear will always point to last element 
        this.size=this.size+1;//initally size is zero
        System.out.println(item + " enqueued to queue ");
        
    }
    int dequeue()
    {
        if (isEmpty(this))
        {
            return Integer.MIN_VALUE;
        }
        int item=this.arr[this.front];//front is intially zero and the first added item in queue is also zero position
        this.front=(this.front + 1)%this.capacity;// 0+1=1%4=1 , 1+1=2%4=2; 2+1=3%4=3; 3+1=4%4=0; loop
        this.size=size-1; // reduce total size
        return item;
        
    }
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
          
        return this.arr[this.front];
    }
       
    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
          
        return this.arr[this.rear];
    }

public static void main(String args[])
{
   SimpleQueue queue=new SimpleQueue(4);
   queue.enqueue(1);
   queue.enqueue(2);
   queue.enqueue(3);
   queue.enqueue(4);
      
   System.out.println("front is "+queue.front());
   System.out.println("rear is "+queue.rear());
   System.out.println("decuded "+queue.dequeue());
   System.out.println("New front is "+queue.front());
   
}

}
