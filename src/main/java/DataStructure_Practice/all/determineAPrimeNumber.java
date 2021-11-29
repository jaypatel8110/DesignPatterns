package DataStructure_Practice.all;

import java.util.stream.IntStream;

public class determineAPrimeNumber {

    //checks whether an int is prime or not.
    static boolean isPrime(int n) {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
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
    static boolean isPrimeMethod3(int number)
    {
        if(number <= 2)
            return number == 2;
        else
            return  (number % 2) != 0
                    &&
                    IntStream.rangeClosed(3, (int) Math.sqrt(number))
                            .filter(n -> n % 2 != 0)
                            .noneMatch(n -> (number % n == 0));
    }

    public static void main(String[] args) {
//        if (isPrime(11))
//            System.out.println(" true");
//        else
//            System.out.println(" false");

        System.out.println(isPrimeMethod2(-1).toString());
    }
}
