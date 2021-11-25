/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.array;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author JAY PATEL
 */
public class InsertSorted {

    static int insert(int[] arr, int key, int position, int capacity) {

        if (position > capacity) {
            return position;
        }

        int i;
        for (i = position - 1; (arr[i] > key && i > 0); i--)//we will start from  last position and continue to shift i to next postion
        {
            arr[i + 1] = arr[i];
        }

        arr[i + 1] = key;
        return position + 1;
    }

    public static void main(String[] args) {


        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 9;

        int capacity = arr.length;
        int key = 6;
        int p = 4;

        System.out.println("Before insertion");
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("after  insertion");
        p = insert(arr, key, p, capacity);

        for (int i : arr) {
            System.out.print(" " + i);
        }
    }

}
