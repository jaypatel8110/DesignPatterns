
package DataStructure_Practice.linkedlist;


public class lf
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
        lf list=new lf();
        list.head=new Node(1);// linking head with 1st node
        Node second=new Node(2);
        Node third=new Node(3);
        
        list.head.next=second;// Link first node with the second node
 
        second.next=third; //Link second node with the third node
        
        list.prin();
        
        
    }
    

}
