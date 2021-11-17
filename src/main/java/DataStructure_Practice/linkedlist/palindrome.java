package DataStructure_Practice.linkedlist;

import java.util.Arrays;

public class palindrome 
{
    Node head;
    Node left;
    public class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
            
        }
        
    }
    boolean isPalindromeUtil(Node right)
    {
        left=head;
        if(right==null){return true;}
        
        boolean isp=isPalindromeUtil(right.next);
        
        if(isp==false)
        {return false;}
        boolean isp1 = (right.data == (left).data);
        /* Move left to next node */
        left = left.next;
 
        return isp1;
        
    }
    boolean isPalindrome(Node head)
    {
        boolean result=isPalindromeUtil(head);
        return result;
    }
    public void push(int new_data)
    {
        Node new_Node=new Node(new_data);
        new_Node.next=head;
        head=new_Node;
    
    }
   void print(Node ptr)
    {
        while(ptr!=null)
        {
            System.out.print(ptr.data+" -->");
            ptr=ptr.next;
        }
        System.out.println("NULL");
        
    }
    public static void main(String args[])
    {
        palindrome pl=new palindrome();
        char str[]={'a','b','a','c','a','b','a'};
     
        
        for(int i=0;i<7;i++)
        {
            pl.push(str[i]);
            pl.print(pl.head);
            if (pl.isPalindrome(pl.head) != false) 
            {
                System.out.println("Is Palindrome");
                System.out.println("");
            } 
            else
            {
                System.out.println("Not Palindrome");
                System.out.println("");
            }
        }
    }

}