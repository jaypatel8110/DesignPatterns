/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.heap;

/**
 *
 * @author JAY PATEL
 */
public class MinHeap {
    
    private int size;
    private int[]Heap;
    private int maxsize;
    
    private static final int FRONT = 1;

    public MinHeap(int maxsize) 
    {
        this.maxsize=maxsize;
        this.size=0;
        Heap=new int[maxsize];
       // Heap[0]=Integer.Min_Value;
        
    }
       
    public void insert(int element)
    {
        Heap[++size]=element;
        int current=size;
        while(Heap[current]<Heap[parent(current)])
        {
            swap(current,parent(current));
            current=parent(current);
        }
    }
    private void swap(int pos1,int pos2)
    {
        int temp;
        temp=Heap[pos1];
        Heap[pos1]=Heap[pos2];
        Heap[pos2]=temp;
        
    }
    private int parent(int pos)
    {
        return pos/2;
    }
    
   
   
    public void minHeap()
    {
        for(int pos=(size/2);pos>=1;pos--)
        {
            minHeapify(pos);
        }
    }
    void minHeapify(int pos)
    {
        if(!isLeaf(pos))
        {
            if ( Heap[pos] > Heap[leftChild(pos)]  || Heap[pos] > Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
   }
    boolean isLeaf(int pos)
    {
        if(pos>=(size/2) && pos<=size)
        {
            return true;
        }
        return false;
    }
    int leftChild(int pos)
    {
        return (pos*2);
    }
    int rightChild(int pos)
    {
        return (pos*2)+1;
    }
    public void print()
    {
        for (int i = 1; i <= size / 2; i++ )
        {
            System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i] 
                + " RIGHT CHILD :" + Heap[2 * i  + 1]);
            System.out.println();
        } 
    }
    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        minHeapify(FRONT);
        return popped;
    }
public static void main(String args[])
{
   
    System.out.println("The Min Heap is ");
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.minHeap();
        minHeap.print();
        System.out.println("The Min val is " + minHeap.remove());
    
}

}
