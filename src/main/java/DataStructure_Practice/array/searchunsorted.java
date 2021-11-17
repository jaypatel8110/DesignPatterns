
package DataStructure_Practice.array;

import java.util.Scanner;


public class searchunsorted {
    
    static int search(int[]arr,int key)
    {
      
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
            
        }
        return -1;
        
    }    
    
    public static void main(String args[]){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int lenght=sc.nextInt();
       int arr[]=new int[lenght];
       
       for(int i=0;i<lenght;i++)
        {
           System.out.print("Enter element number " +(i)+"\t");
           arr[i]=sc.nextInt();
        }
       
       System.out.println("You entered");
        for(int i:arr)
            {
           System.out.printf(" "+i);
            }
       System.out.println();
       
       System.out.println("Enter the key to search");
       int key=sc.nextInt();
       
       int position=search(arr,key);
       
       if(position==-1)
       {
           System.out.println("No match found");
       }else
       {
       System.out.println("Element found at postion "+(position+1));
       }
       
       
       
        
      
       
       
          
    }
}
