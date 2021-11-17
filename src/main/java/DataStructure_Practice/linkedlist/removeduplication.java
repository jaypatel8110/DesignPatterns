package DataStructure_Practice.linkedlist;

public class removeduplication //of shorted list
{
    Node head;  
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
     public void push(int new_data)
    {
        Node new_node = new Node(new_data); 
        new_node.next = head;

        head = new_node;
    }
     void play()
     {
         Node current=head;
         Node Next_next;
         if(head==null){return;}
         
         while(current.next!=null)
         {
             if(current.data==current.next.data)
             
             {
                 Next_next=current.next.next;
                 current.next=null;
                 current.next=Next_next;
             }
             else
             {
             current=current.next;
             }
         }
     }
      void printList()
     {
         Node temp = head;
         while (temp != null)
         {
            System.out.print(temp.data+" ");
            temp = temp.next;
         }  
         System.out.println();
     }
 
    
    public static void main(String args[])
    {
        removeduplication llist=new removeduplication();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
         System.out.println("List before removal of duplicates");
        llist.printList();
         
        llist.play();
         
        System.out.println("List after removal of elements");
        llist.printList();
    }

}