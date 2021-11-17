/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Practice.queue;
class Try
{
    jay head;  // head of list
 
    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class jay {
        int data;
        jay next;
        jay(int d)  { data = d;  next=null; } // Constructor
    }
 
    /* This function prints contents of linked list starting from head */
    public void printList()
    {
        jay n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
 
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Try llist = new Try();
 
        llist.head       = new jay(1);
        jay second      = new jay(2);
        jay third       = new jay(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
 
        llist.printList();
    }
}
