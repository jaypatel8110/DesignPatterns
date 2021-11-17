package DataStructure_Practice.linkedlist;

public class numberofoccurence 
{
    Node head;
    
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
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    int count(int x)
    {
       
        Node temp=head;
         int count=0;
        while (temp!=null)
        {
          if (temp.data==x)
          {
              count++;
              
          }
          temp=temp.next;
          
        }
         return count;
    }
    
    public void prin()
        {
            Node n=head;
            while(n!=null)
            { System.out.print(n.data+" ");
            n=n.next;
            }
        }
    public static void main(String args[])
    {
        numberofoccurence noo=new numberofoccurence();
        noo.push(1);
        noo.push(2);
        noo.push(1);
        noo.push(2);
        noo.push(3);
        noo.push(1);
        noo.push(4);
        
        System.out.println("Array is ");
        noo.prin();
        
        
        System.out.println(" \nNO of accurense  is "+noo.count(2));
        
    }

}