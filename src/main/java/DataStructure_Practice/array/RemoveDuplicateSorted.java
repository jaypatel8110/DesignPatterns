package DataStructure_Practice.array;

//https://www.geeksforgeeks.org/java-program-to-remove-duplicate-elements-from-the-array/


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSorted {

    private static int removeDuplicates(int[] arr, int n) {
        //Time Complexity: O(n)
        // if(array size if 0 or 1 array is already sorted)
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
            }
        }

        arr[j++] = arr[n - 1];
        return j;
    }

    private static int removeDuplicatesFromUnsorted(int[] arr, int n) {
        //Time Complexity: O(n)
        // if(array size if 0 or 1 array is already sorted)
        arr = Arrays.stream(arr).sorted().toArray();
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
            }
        }

        arr[j++] = arr[n - 1];
        return j;
    }

    public static int[] removeDuplicatesWithSet(int[] a) {

        Set<Integer> integers= new LinkedHashSet<Integer>();
        for(int i : a)
            integers.add(i);

        return integers.stream().mapToInt(Integer::intValue).toArray();

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        //n = removeDuplicates(arr, n);
        int[] arrUnsorted = {5, 2, 6, 8, 6, 7, 5, 2, 8};
        n = removeDuplicatesFromUnsorted(arrUnsorted, arrUnsorted.length);

        int [] result = removeDuplicatesWithSet(arr);
        Arrays.stream(result).forEach( a->System.out.print(a));
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


}

