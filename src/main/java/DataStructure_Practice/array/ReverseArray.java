/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure_Practice.array;

import java.util.Arrays;

/**
 * @author JAY PATEL
 * Time Complexity : O(n)
 * https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
public class ReverseArray {


    static void print(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr, int low, int high) {
        int temp = arr[low];

        if (low >= high) {
            return;
        }
        arr[low] = arr[high];
        arr[high] = temp;
        reverse(arr, low + 1, high - 1);
    }

    /* Function to reverse arr[] from
        start to end*/
//    static void rvereseArrayWithWhile(int[] arr, int start, int end) {
//        int temp;
//
//        while (start < end) {
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        System.out.println("Old array is");
        print(arr);
        System.out.println("After reversing");
        reverse(arr, 0, n - 1);
        print(arr);
    }

}
