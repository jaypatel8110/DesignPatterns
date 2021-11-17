package DataStructure_Practice.linkedlist;

public class shortedllist 
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
            
        }
    }
    //insert new node in list
    void play(Node new_node)
    {
      Node current;
      if(head==null || head.data>=new_node.data) // if no head or new data is less than head than make it head
      {
          new_node.next=head; // first make next of new data as head, and them make head as new data
          head=new_node;
          
      }else
      {
          /* Locate the node before point of insertion. */
      current=head;
      
      while(current.next!=null && current.next.data<new_node.data)/*now we now that head is small because it came to
          else statement soo...if next of head is not null nad its data is small than new data that means
          we have to keep the new data after that*/
          
          {
          current=current.next; // take the pointer to next of current data ..and continye untile smaller value than new data is found
          }
      
          new_node.next=current.next;// 1 2 4>> (2)current >>new data 3 >> 3(new next)-->4(current next)
          current.next=new_node;//2(current next)-->3(new data)...1 2 3 4
          
      
      }
      
    }
    
    //to crate a node
    Node newnode(int data)
    {
        Node x=new Node(data);
        return x;
    }
     void printList() // to print
     {
         Node temp = head;
         while (temp != null)
         {
            System.out.print(temp.data+" ");
            temp = temp.next;
         }
     }
    public static void main(String args[])
    {
        shortedllist sh=new shortedllist();
        Node new_node;
        new_node=sh.newnode(5);
        sh.play(new_node);
        new_node=sh.newnode(4);
        sh.play(new_node);
        new_node=sh.newnode(7);
        sh.play(new_node);
        new_node=sh.newnode(9);
        sh.play(new_node);
        sh.printList();
    }

}