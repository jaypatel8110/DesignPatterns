package DataStructure_Practice.linkedlist;

public class oddevenarrange 
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
    void play()
    {
        Node end=head;
        Node current=head;
        Node prev=null;
        
        while(end.next!=null){end=end.next;} // this will take to end and at the end we have end value as end
        Node new_end=end;
        
        while(current.data%2!=0 && current!=end)// for odd values (if head is odd then this will run first else the even loop)
        {
            new_end.next=current; 
            current=current.next;
            new_end.next.next=null;
            new_end=new_end.next;
        }
        
        if(current.data%2==0)//for even node 
        {
            head=current;//current points to head because when we traverse till here we have even number as first element 
           
            while(current!=end )
            {
                if(current.data%2==0)
                {
                    prev=current;
                    current=current.next;
                    
                }
                else// it will come here if the next value is odd
                {
                    
                    prev.next=current.next; // breaking the link
                    current.next=null; // becouse last node
                    new_end=current; //current as end 
                    current=prev.next;  //current new value    
                }
                
            }
        }
        else
        {prev=current;}
        
        if(new_end!=end && end.data %2 != 0)
        {
            prev.next=end.next;
            end.next=null;
            new_end.next=end;
        }
        
    
    }
    public void push(int new_data)
    {
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    
    public void prin()
        {
            Node n=head;
            while(n!=null)
            { System.out.print(n.data+" ");
            n=n.next;
            }
            System.out.println(" ");
        }
    public static void main(String args[])
    {
        oddevenarrange dm=new oddevenarrange();
        dm.push(0);
        dm.push(1);
        dm.push(3);
        dm.push(7);
        dm.push(2);
        dm.push(2);
        dm.push(3);
        dm.push(0);
        System.out.println("Array is ");
        dm.prin();
         dm.play();
        System.out.println("\nnew List  is ");
       
        dm.prin();
        
    }

}