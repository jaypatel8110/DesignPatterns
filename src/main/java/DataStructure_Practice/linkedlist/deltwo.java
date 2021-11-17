package DataStructure_Practice.linkedlist;

//delete according to node position 
public class deltwo 
        
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    void delnode(int position)
    {
        if(head==null){return;}//if list is empty
        Node temp=head;
        if(position==0) //make the next node and head..so it removes the link
        {
            head=temp.next;
            return;
        } 
        
        for(int i=0;temp!=null && i<position-1;i++)//find the previous of node to be deleted 
                                                   //  ,-1 because we dont it to enter until prev node
        {
                                                   //  ,-1 because we dont it to enter until prev node
             temp=temp.next;
        }
        //temp is the prev node here
        if(temp==null || temp.next==null)//if position is more than number of nodes
        {
            return;
        } Node next=temp.next.next; //store next of deleting node as next
        
        temp.next=next;//unlink the deleting node
        
    }
    void print()
    {
        Node pnode=head;
        while(pnode!=null)
        {
            System.out.print(pnode.data+ " ");
            pnode=pnode.next;
            
        }
    }
    
    
    public static void main(String args[])
    {
        deltwo two=new deltwo();
        two.push(1);
        two.push(2);
        two.push(0);
        two.push(-1);
        
        System.out.println("created linked list");
        two.print();
        
        two.delnode(1);
        System.out.println("\n modified linked list");
        two.print();
    }

}