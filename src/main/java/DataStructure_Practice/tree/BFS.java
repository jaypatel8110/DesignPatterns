/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.tree;

/**
 *
 * @author JAY PATEL
 */
class Node
{     
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            left=right=null;
        }
}

class BFS {
   Node root;

   public BFS()
   {
       root=null;
   }

    void print()
   {
       int h=height(root);
       System.out.println(h);

       for(int i=1;i<=h;i++)
       {
           logic(i,root);
       }
   }
    int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int l=height(root.left);
            int r=height(root.right);

            return Integer.max(l, r)+1;
        }
    }
    void logic(int i,Node root)
    {
        if(root==null)
        {
            return;
        }
        if(i==1)
        {
            System.err.print(root.data);
        }else
        {
            logic(i-1,root.left);
            logic(i-1,root.right);
        }
    }
public static void main(String args[])
{
      BFS tree=new BFS();
      tree.root= new Node(1);
      tree.root.left= new Node(2);
      tree.root.right= new Node(3);
      tree.root.left.left= new Node(4);
      tree.root.left.right= new Node(5);
      tree.print();
}

}
