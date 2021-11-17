
package DataStructure_Practice.linkedlist;

public class addrandom {
    
    
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
        public void prin()// for printing 
        {
            Node n=head;
            while(n!=null)
            { System.out.print(n.data+" ");
            n=n.next;
            }
        }
        public void add(Node prev_node,int new_data)
        {
            if(prev_node==null)
            {
                System.out.println("privous node can not be null");
                return;
            }
            Node new_node=new Node(new_data);
            new_node.next=prev_node.next;
            prev_node.next=new_node;
            
            
        }
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        addrandom list=new addrandom();
        list.head=new Node(1);// linking head with 1st node
        Node second=new Node(2);
        Node third=new Node(3);
        
        list.head.next=second;// Link first node with the second node
 
        second.next=third; //Link second node with the third node
        list.add(second,3);
        list.prin();
        
        
    }
    
}
