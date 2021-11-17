package DataStructure_Practice.linkedlist;



public class lenghtfinder
{
    Node head;
    
        public void push(int new_data)
        {
            Node new_node=new Node(new_data);
            new_node.next=head;
            head=new_node;
        }
        public int getcount()
        {
            Node temp=head;
            int count=0;
            while(temp!=null)
            {
              count++;
             temp=temp.next;
             
           }
            return count;
            
        }
        
        
    
    
    
    public static void main(String args[])
    {
        lenghtfinder fin=new lenghtfinder();
        fin.push(1);
        fin.push(2);
        fin.push(3);
        System.out.print("No of elements  "+fin.getcount());
        
    }

}