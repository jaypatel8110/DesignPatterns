package DataStructure_Practice.linkedlist;

public class delifgreateronside 
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
    void play1()
    {
        reverselist();
        
        play();
        
        reverselist();
    }
    void play()
    {
        
        Node maxnode=head;
        Node current=head;
        Node temp;
        
        
       while(current!=null && current.next!=null)
        {
            if(current.next.data<maxnode.data)// if next of head is smaller than current than delete current 
            {
               temp=current.next;
               current.next=temp.next;              
            }
            else
            {
                current=current.next;
                maxnode=current;
            }
            
        }
        
    }
    void reverselist()
    {
        Node current=head;
        Node prev=null;
        Node next;
        
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        head=prev;
        
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
        delifgreateronside dr=new delifgreateronside();
        dr.push(0);
        dr.push(1);
        dr.push(5);
        dr.push(4);
        System.out.println("old list is ");
        dr.prin();
        
        dr.play1();
         System.out.println(" \nnew list is ");
        
        dr.prin();
        
        
        
         
    }

}