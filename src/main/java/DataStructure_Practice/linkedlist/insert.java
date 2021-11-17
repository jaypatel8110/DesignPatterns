/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Practice.linkedlist;

/**
 *
 * @author JAY PATEL
 */
public class insert {
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
    public void push(int new_data)//for push function
    {
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
            
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
        insert list=new insert();
        
        
       
        list.push(5);
     
        list.prin();
         
        
        
    }
    
    
}
