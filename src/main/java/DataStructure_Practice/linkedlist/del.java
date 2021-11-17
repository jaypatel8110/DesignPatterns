package DataStructure_Practice.linkedlist;

public class del 
{
       Node head;
    class Node//node creation
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;        
        }
    }
    
    void randel(int key)
    {
        Node temp=head , prev=null;
        if(temp !=null && temp.data==key)//if it is the first element
        {
            head=temp.next;
            return;
        }
        while(temp !=null && temp.data!=key) //loop until find the data
        {
            prev=temp;
            temp=temp.next;
            
        }
        if(temp==null){return;}
        prev.next=temp.next; //prev is node before temp and temp is current. so we remove reference of temp
        
    }
    public void push(int new_data)// inserting in front of the list
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
        
    }
    
    public void print()// for printting
    {
       Node pnode=head;
       while(pnode!=null)
       { System.out.println(pnode.data+ "");
       pnode=pnode.next;
       }
       
    }
    public static void main(String args[])
    {
        del de=new del();
        de.push(1);
        de.push(2);
        de.push(3);
        de.push(4);
        de.randel(3);
        de.print();
        
    }

}