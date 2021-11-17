package DataStructure_Practice.linkedlist;

//look for another example
public class intersectionpoint 
{
    static Node head1,head2;
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
    int getNode()
    {
        int c1=getcount(head1);
        int c2=getcount(head2);
        int d;
        
        if(c1>c2)
        {
            d=c1-c2;
            return _getIntesectionNode(d, head1, head2);
            
        }else
        {
            d=c2-c1;
            return _getIntesectionNode(d, head1, head2);
        }
    }
    int _getIntesectionNode(int d,Node node1,Node node2)
    {
        int i;
        Node current1=node1;
        Node current2=node2;
        for(i=0;i<d;i++)
        {
            if(current1==null) //if list is empty
            {
                return -1;
            }
            current1=current1.next;
        }
            
            while(current1!=null && current2!=null)
            {
                if(current1.data==current2.data)
                {
                    return current1.data;
                }
                current1=current1.next;
                current2=current2.next;
            }
            return -1;
        }
        
    
    int getcount(Node node) //function to get counts
    {
        Node current=node;
        int count=0;
        while(current!=null)
        {
            count++;
            current=current.next;       
        }
        
        return count;
        
    }
    
    
    public static void main(String args[])
    {
        intersectionpoint ip=new intersectionpoint();
       // creating head 1
        intersectionpoint.head1=new Node(5);
        intersectionpoint.head1.next=new Node(10);
        intersectionpoint.head1.next.next=new Node(15);
        intersectionpoint.head1.next.next.next=new Node(15);
        intersectionpoint.head1.next.next.next.next=new Node(25);
        
        // creating head 2
         intersectionpoint.head2=new Node(16);
        intersectionpoint.head2.next=new Node(15);
        intersectionpoint.head2.next.next=new Node(25);
        
        System.out.println("The node of intersection is " + ip.getNode());
        
        
       
        
    }

}