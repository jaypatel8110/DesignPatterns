package DataStructure_Practice.linkedlist;

public class end 
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
     public void last(int new_data)
     {
         Node new_node=new Node(new_data);
         
         while(head==null)
         { head=new Node(new_data);
           return;
         }
         new_node.next=null;
         Node last=head;
         while(last.next!=null)
         {
             last=last.next;
         }
         last.next=new_node;
         
     }
        public void prin()// for printing 
        {
            Node n=head;
            while(n!=null)
            { System.out.print(n.data+" ");
            n=n.next;
            }
        }
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        end list=new end();
        list.head=new Node(1);// linking head with 1st node
        Node second=new Node(2);
        Node third=new Node(3);
        
        list.head.next=second;// Link first node with the second node
 
        second.next=third; //Link second node with the third node
        list.last(2);
        list.prin();
        
        
    }
    

}