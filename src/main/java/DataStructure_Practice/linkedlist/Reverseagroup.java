package DataStructure_Practice.linkedlist;

 class Reverseagroup 
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
            Node new_Node=new Node(new_data);
            new_Node.next=head;
            head=new_Node;       
        }
       
       Node  play(int k,Node head)
       {
           Node current=head;
           Node next=null;
           Node prev=null;
           
           int count=0;
           
           while(count<k && current!=null)
           {
               next=current.next;
               current.next=prev;
               prev=current;
               current=next;
               count++;
           
           }
           if(next!=null)//here next means after the 3 rd element that is 4th element 
           {
               head.next=play(k, next);// recursive calling itself and head is fist element but that is now last so 
               
           }
           return prev;// prev is new head becouse prev=4 
       
       }
 
        
        void print()
        {
            Node pnode;
            pnode=head;
            
            while(pnode!=null)
            {
                System.out.print(pnode.data+" ");
                pnode=pnode.next;
             }
    }
    public static void main(String args[])
    {
        Reverseagroup rg=new Reverseagroup();
        rg.push(1);
        rg.push(2);
        rg.push(3);
        rg.push(4);
        rg.push(5);
        rg.push(6);
        
        System.out.println("before change");
        
        rg.print();
        
        System.out.println("\nafter change");
        
        rg.head=rg.play(3, rg.head);//privous returns here as new head  and then head is passed to print
        
        rg.print();
        
        
    }

}