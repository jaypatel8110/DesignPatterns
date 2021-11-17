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
public class Deletion {
    
    class Node  //function to create code
    {
        int key;
        Node left,right;

        public Node(int data) 
        {
            key=data;
            left=right=null;
        }
    }
    
   static Node root;
   
   static void rootvalue()
   {
       System.out.println("This is latest root value "+ root.key);
   }
    
    public Deletion() //default constructor will be called when object is created and null value will be assigned to root
    {
        root=null;
    }
    
    void insert(int key) //will pass key to insert , we need this indirect method because we will pass int to insert 
                            // and then we need to make it node
    {
        root=insertfull(root,key);
    }
    
    Node insertfull(Node root , int key)
    {
        if(root==null)//condition to insert 
        {
            root=new Node(key);
            return root;
        }
        if(key<root.key)
        {
            root.left=insertfull(root.left, key);
        }else
        {
            root.right=insertfull(root.right, key);
        }
        return  root;
    }
    void inorder(Node root) //function to print in inorder style
    {
        if(root!=null) //will stop entering this when we are at last node and then goes to next print function
        {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
         
    }
    void delete(int key)
    {
        root=delmain(root,key);
    }
    Node delmain(Node root,int key)
    {
        if(root==null) // if list is empty
        {
            return root;
        }
        if(key<root.key)
        {
            root.left=delmain(root.left, key);
        }else if(key>root.key)
        {
            root.right=delmain(root.right,key);
        }
        else  // will enter this when we find the key to be deleted
        {
            //node with zero or one chid
            if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
             // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key=minvalue(root.right); // will have smallest in right because it will be greated from left tree
                                            // and will replace with root key(i.e data to b deleted)
            
           //now delete that key which is duplicate (the one we copied)
           //since it will last and have null value it will return back from starting point only
           root.right=delmain(root.right, root.key);
           
        }
        
       return root; 
    }
    int minvalue(Node root)
    {
     int mval=root.key; // will have first value as min and will update as we get smaller and smaller
     if(root!=null)
     {
         mval=root.left.key;
         root=root.left;
     }
     return mval;
    }

public static void main(String args[])
{
     Deletion tree=new Deletion();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder(root);
        System.out.println();
        tree.delete(50);
        System.out.println("after Deletion");
        tree.inorder(root);
        System.out.println();
        tree.rootvalue();
        
        
        
        
        
        
     
}

}
