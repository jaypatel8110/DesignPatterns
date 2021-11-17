/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.matrix;

/**
 *
 * @author JAY PATEL
 */
public class ReadysolutionMatrixZero {

public static void main(String args[])
{
    /*
    class SolutionBinaryMatrix{
  static  int one_row=120; // Random High Value to initialise
    static int one_col=120; //Random High Value to initialise   
    public static void changeMatrix(int[][] a){
    
      
        int row=a.length;
        int col=a[0].length;
        
       
//	Find Index of First Row where '1' Occurs.
		for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
				if(a[i][j]==1){
            //    rowFlag=true;
					one_row=i;
					break;
				}			
			if(one_row!=120){
				break;
			}
	        }
		}        
    
		
//Find Index of First Column where '1' Occurs.
    for(int j=0;j<col;j++){
			for(int i=0;i<row;i++)
			if(a[j][i]==1){
              //  colFlag=true;
				one_col=j;
				break;
            }
			if(one_col!=120){
				break;
			}
			
        }        

  
//Make auxillary Row and Column Array as 0(Initialising to 0)
	for(int j=0;j<col;j++){
	a[one_row][j]=0;
	}
	
	for(int i=0;i<row;i++){
	a[i][one_col]=0;
	}
	

//Scan the input Matrix.
//If element is in the one_row or one_column, dont do anything, continue.
//For elements in submatrix, if element =1, then set the row index and column index in auxillary arrays as 1.
	
	for(int i=0;i<row;i++){
		if(i==one_row)
			continue;
		    for(int j=0;j<col;j++){
				 {
					if(j==one_col)
						continue;
					 if(a[i][j]==1){
					      	a[one_row][j]=1;
						    a[i][one_col]=1;
					   }
					 
				 }	
							  
			  }	
		  
			  
	
	}

//Scan the input Matrix.
//If element is in the one_row or one_column, dont do anything, continue.
//For elements in submatrix, if element =0, then replace the element according to auxillary array.

	for(int i=0;i<row;i++){
		if(i==one_row)
			continue;
		for(int j=0;j<col;j++){
			if(j==one_col)
				continue;
			if(a[i][j]==0){
				if(a[one_row][j]==1 || a[i][one_col]==1){
					a[i][j]=1;
					}
				}
			}
     }

//Finally,Set elements of auxillary Row and Column Array as 1(Initialising to 1)
	for(int j=0;j<col;j++){
	a[one_row][j]=1;
	}
	
	for(int i=0;i<row;i++){
	a[i][one_col]=1;
	}
	System.out.println("");	
	System.out.println("Changed Matrix");

//Print the final Changed Matrix
	
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			System.out.print(" "+a[i][j]);
			 
		}
		System.out.println();
	}
}
    
	public static void main (String[] args) {
		//Initialising Array
		int[][] array=new int[][]{{0,0,1,0},{0,1,0,0},{0,0,1,0},{0,0,0,0}};
		changeMatrix(array);
	
	}

    
}
    */
}

}
