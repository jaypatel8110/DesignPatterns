/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.BST;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author JAY PATEL
 * http://www.geeksforgeeks.org/print-binary-tree-vertical-order-set-2/
 * 
 */


public class PrintVertical {
    
     static class Node{
        
        int data;
        Node left,right;
        
        public Node(int key) {
            data=key;
            left=right=null;
           }
     
    }
     
      static void printVerticalOrder(Node root)
    {
        TreeMap<Integer,Vector<Integer>> m=new TreeMap<>();
        int hd=0; //will be used as a pointer
        getVerticalOrder(root,hd,m );
        for (Entry<Integer, Vector<Integer>> entry : m.entrySet())
        {
            System.out.println(entry.getValue());
        }

        
    }
      static void getVerticalOrder(Node root,int hd ,TreeMap<Integer,Vector<Integer>> m){
      
          if(root==null){
          return;
          }
          
          Vector<Integer>get=m.get(hd); // for new values it will be null and if it has value associated with it than it will
                                        //be assigned to get 
          if(get==null){
              get = new Vector<>();
              get.add(root.data);
          }
           else
            get.add(root.data); //if already has data then will append new value at end
          
          m.put(hd, get);  //put the index at hd and values of vector(set);
          
          getVerticalOrder(root.left, hd-1, m);  //recurvisely call both trees
          getVerticalOrder(root.right, hd+1, m);
            
      }
              
    
   

public static void main(String args[])
{
     Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(root);
}

}


