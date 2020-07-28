package Streams;

import java.time.Month;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestAll {

    static void init() {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> numbersStream = numbersList.stream();
        Stream<Integer> oddNumbersStream = numbersStream.filter(n -> n % 2 == 1);
        Stream<Integer> squaredNumbersStream = oddNumbersStream.map(n -> n * n);
        // Sum all integers in the stream
        Stream<String> stream = Stream.of("Hello");
        int sum = squaredNumbersStream.reduce(0, (n1, n2) -> n1 + n2);
        Stream.Builder<String> builder = Stream.builder();
        // Sum all integers in the stream
        int sumAnother = squaredNumbersStream.reduce(0, Integer::sum);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 0)
                .filter(integer -> integer > 5)
                .forEach(System.out::println);

        Stream.of(1, 2, 3)
                .flatMap(n -> Stream.of(n, n * n))
                .forEach(System.out::println);

        long count = Stream.of("Ken", "Jeff", "Ellen")
                .map(name -> name.chars())
                .flatMap(intStream -> intStream.mapToObj(n -> (char) n))
                .filter(ch -> ch == 'e' || ch == 'E')
                .count();
    }

     static void testingReduce() {

        Optional<Person> person = Person.persons()
                .stream()
                .reduce((person1, person2) -> person1.getIncome()>person2.getIncome()?person1:person2);
         if (person.isPresent()) {
             System.out.println("Highest earner: " + person.get());
         }
         else {
             System.out.println("Could not get the highest earner.");
         }

    }


    static void testSummary(){
        DoubleSummaryStatistics incomeStats =
                Person.persons()
                        .stream()
                        .collect(Collectors.summarizingDouble(Person::getIncome));
    }

    static void testCollectrs(){

        Map<Person.Gender, Map<Month, String>> personsByGenderAndDobMonth
                = Person.persons()
                .stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.groupingBy(p -> p.getDob().getMonth(),
                                Collectors.mapping(Person::getName,
                                        Collectors.joining(", ")))));
        System.out.println(personsByGenderAndDobMonth);
    }

    public static void main(String[] args) {
        //init();
       //testingReduce();
    testCollectrs();

    }
}
