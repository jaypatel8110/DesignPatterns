/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.BST;

/**
 *
 * @author JAY PATEL
 */
public class Insert {
    
   
    class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data) 
        {
            this.data=data;
            left=right=null;
        }    
    }
    
    Node root;
    public Insert() 
    {
        root=null;
    }
    void push(int data)
    {
        root=pushmain(root, data);
    }

    Node pushmain(Node root, int data)
    {
      
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=pushmain(root.left, data);
        }else if(data>root.data)
        {
            root.right=pushmain(root.right, data);
        }
        return root;
    }
    void print()
    {
        print2(root);
    }
    void print2(Node node)
    {
        if(node!=null)
        {
            print2(node.left);
            System.out.println(node.data);
            print2(node.right);
        }
    }
public static void main(String args[])
{
        Insert tree=new Insert();  
       tree.push(50);
        tree.push(30);
         tree.push(20);
          tree.push(40);
           tree.push(70);
            tree.push(60);
             tree.push(80);
             
         tree.print();
           
 
}

}
