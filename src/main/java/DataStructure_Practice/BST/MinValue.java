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


public class MinValue {
   
   static Node root;

    public MinValue() //will be called once assign it with null
    {
        root=null;
    }
  
    void insmin(int data)
    {
        root=insert(root, data);
    }
    
   Node insert(Node root ,int key)
   {
       if(root==null)
       {
           root=new Node(key);
           return root ;
       }
       else {
       
            if(key<root.data)
            {
               root.left=insert(root.left ,key);
            }else if(key>root.data)
            {
                root.right=insert(root.right, key);
            }
             return root;   
            }
       }
   
   void inorder()  {
       inordermain(root);
    }
   
  void inordermain(Node root){
      if(root!=null)
      {
          inordermain(root.left);
          System.out.println(" "+root.data);
          inordermain(root.right);
      }
      
  }
  
  int val(Node nood)
  {
      Node current=nood;
      while(current.left!=null)
      {
          current=current.left;
      }
      return current.data;
  }
      
public static void main(String args[])
    {
    MinValue tree=new MinValue();
    tree.insmin(50);
    tree.insmin(30);
    tree.insmin(20);
    tree.insmin(40);
    tree.insmin(70);
    tree.insmin(60);
    tree.insmin(80);
    tree.inorder();
    System.out.println("Min value is "+tree.val(root));
          
    }

}

class Node{
       
       int data;
       Node right,left;
       
        public Node(int key)
        {
            data=key;
            right=left=null;           
        }
  
   }
   
