package DataStructure_Practice.linkedlist;

public class swap 
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
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void play(int x,int y)
    {
        if(x==y){return;}
        Node prevx=null ,currx=head;
        while (currx!=null && currx.data!=x)//search x
        {
            prevx=currx;
            currx=currx.next;
        }
        
         Node prevY = null, currY = head;
         while(currY!=null && currY.data!=y)//search y
         {
             prevY=currY;
             currY=currY.next;
         }
        if( currx==null || currY==null)//If either x or y is not present, nothing to do
        {
            return;
        }
        if(prevx!=null)// If x is not head of linked list
        {
            prevx.next=currY;
        }else{head=currx;}
        
        if(prevY!=null)// If y is not head of linked list
        {
            prevY.next=currx;
        }
              else 
              { head = currx;}// make x the new head
        Node temp=currx.next;
        currx.next=currY.next;
        currY.next=temp;
        
        
        
    }
    public void printlist()
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
        swap sw=new swap();
        sw.push(1);
        sw.push(2);
        sw.push(3);
        sw.push(4);
        sw.push(5);
        sw.push(6);
        
         System.out.println("before swap  ");
         sw.printlist();
         
         System.out.println("\nafter swap");
         sw.play(2,3);
         sw.printlist();
    }

}