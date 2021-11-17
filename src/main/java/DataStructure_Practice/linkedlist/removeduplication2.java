package DataStructure_Practice.linkedlist;

public class removeduplication2 
{
    static Node head;
    
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    void remove_duplicates()
    {
        Node ptr1, ptr2,dup ;
        
        ptr1=head;
        while(ptr1!=null && ptr1.next!=null)// checkes in case it reaches at the end
        {
          ptr2=ptr1;
        
        while(ptr2.next!=null)//here pointer 1 is fixed and ptr 2 keeps changing until last
        {
            if(ptr1.data==ptr2.next.data) // if both are same then del the node
            {
                dup=ptr2.next;
                ptr2.next=ptr2.next.next; //make next of next = current pt so unlink middle 
                System.gc();// call garnbage collection 
                
            }
            else
            {
                ptr2=ptr2.next;
            }// if not same take next pointer and compare with first node until all nodes are compared
        }
        ptr1=ptr1.next;//now arter cheking all with first noe take next and check all the others with it 
    
    }
    }
    
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String args[])
    {
        removeduplication2 list = new removeduplication2();
        removeduplication2.head = new Node(10);
        removeduplication2.head.next = new Node(12);
        removeduplication2.head.next.next = new Node(11);
        removeduplication2.head.next.next.next = new Node(11);
        removeduplication2.head.next.next.next.next = new Node(12);
        removeduplication2.head.next.next.next.next.next = new Node(11);
        removeduplication2.head.next.next.next.next.next.next = new Node(10);
        System.out.println("Linked List before removing duplicates : \n ");
        list.printList(head);
        
         list.remove_duplicates();
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(head);
 
    }
    

}