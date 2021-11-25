/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.array;

/**
 * @author JAY PATEL
 */
public class deleteUnsorted {

    static int getPosition(int[] arr, int l, int deleteThis) {
        int i;

        for (i = 0; i < l; i++) {
            if (arr[i] == deleteThis) {
                return i;
            }
        }
        return -1;
    }


    static int delete(int[] arr, int l, int deleteThis) {

        int position = getPosition(arr, l, deleteThis);

        if (position == -1) {
            System.out.println("element not found");
        }

        int i;
        for (i = position; i < l - 1; l++)//l-1 bcos we dont want last ements null value so reduce the size of array
        {
            arr[i] = arr[i + 1];
        }
        return l - 1;

    }

    public static void main(String[] args) {
        int i;
        int[] arr = {2, 4, 6, 8, 10};
        int l = arr.length;

        int deleteThis = 6;

        l = delete(arr, l, deleteThis);

        System.out.print("New array is ");

        for (i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
