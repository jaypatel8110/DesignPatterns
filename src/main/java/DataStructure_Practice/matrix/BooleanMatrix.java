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
public class BooleanMatrix {

    static void print(boolean mat[][])
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
public static void main(String args[])
{
    boolean mat[][]=new boolean[3][4];
    print(mat);
}

}
