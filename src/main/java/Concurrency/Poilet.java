package Concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Poilet {


    public static void main(String[] args) {
    Executor executor= Executors.newSingleThreadExecutor();
    Runnable task= () -> System.out.println("sd");
    executor.execute(task);

    int[] number ={1,9,4,2,1,4,5};
        IntStream.of(number)
                .distinct()
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .peek(System.out::println)
                .forEach(System.out::println);

    }
}
