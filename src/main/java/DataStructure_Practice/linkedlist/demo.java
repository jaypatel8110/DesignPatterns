package DataStructure_Practice.linkedlist;

public class demo 
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
        demo dm=new demo();
        dm.push(0);
        dm.push(1);
        dm.push(3);
        dm.push(4);
        dm.push(0);
        dm.push(0);
        dm.push(1);
        dm.push(3);
        dm.push(4);
         System.out.println("Array is ");
        dm.prin();
    }

}