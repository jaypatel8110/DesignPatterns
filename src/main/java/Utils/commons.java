package Utils;

public class commons {

    private static int removeDuplicates(int[] arr, int n) {
        //Time Complexity: O(n)
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

    static Boolean isPrimeMethod2(int num){
        if(num<2)
            return false;
        int i = 2;
        boolean flag = true;
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = false;
                break;
            }
            ++i;
        }
        return flag;
    }
    public static void main(String[] args) {

    }
}
