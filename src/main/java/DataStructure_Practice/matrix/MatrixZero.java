/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.matrix;

/**
 *
 * @author JAY PATEL
 * Given a boolean matrix mat[M][N] of size M X N, modify it such that if a
 * matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
 */

public class MatrixZero {

    static int mat[][]=
                {
                 {1, 0, 0, 0},
                 {0, 0, 0, 0},
                 {0, 0, 0, 0} 
                };
    
   static void print(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
            System.out.print( mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
   
   static void logic(int mat[][])
   {
       int rows=mat.length;
       int col=mat[0].length;//length of column
       boolean [][] flag=new boolean[rows][col];
       for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(mat[i][j]==1){
                    flag[i][j]=true;
                }
            }
    }
       for(int i=0; i<rows; i++)
       {
            for(int j=0; j<col; j++)
            {
                if(flag[i][j]==true)
                {
                    /*for rows*/
                    for(int k=0; k<rows; k++) //print row as j remain constant
                    {
                        mat[k][j]=1;
                    }
                    /*for cols*/
                    for(int z=0; z<col; z++)
                    {
                        mat[i][z]=1;
                    }
                }
            }
        }
    }
   
public static void main(String args[])
{
    print(mat);
    
    System.out.println("modified");
    logic(mat);
    
    print(mat);
         
}

}
