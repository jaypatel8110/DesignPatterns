package LamdaExpressions;

import java.util.function.*;

public class TestAll {

    public void testAdder(Adder adder, int a, int b) {

        int sum = adder.add(a, b);
        System.out.println("Result :" + sum);
    }


  private Consumer<String> stringConsumerExample = name -> {
      name = name + " Patel";
      System.out.println("Function Example " + name);
  };

    public static Supplier<String> supplierExamplE() {
        return () -> "Jay";
    }

    public static void main(String[] args) {

        TestAll t = new TestAll();

        t.stringConsumerExample.accept("jay");



        // System.out.println(supplierExamplE().get());
    }


    public void funtionExamples() {

        System.out.println("Function Test-----------");
        System.out.println();
        Function<Long, Long> square = x -> x * x;
        Function<Long, Long> addOne = x -> x + 1;

        Function<Long, Long> squareAddOne = square.andThen(addOne);
        Function<Long, Long> addOneSquare = square.compose(addOne);

        Function<Long, Long> identity = Function.<Long>identity();


        long num = 5L;
        System.out.println("Number : " + num);
        System.out.println("Square and then add one: " + squareAddOne.apply(num));
        System.out.println("Add one and then square: " + addOneSquare.apply(num));
        System.out.println("Identity: " + identity.apply(num));


    }

    private static void methodForTest(TestAll testAll) {
        testAll.testAdder((a, b) -> a + b, 2, 3);

        testAll.testAdder((int a, int b) -> {
                    String j = "J";
                    String aa = "A";
                    String y = "Y";
                    System.out.println("this is more logic inside " + j + aa + y);
                    return a + b;
                }
                , 2, 3);

        Function<Integer, String> fun = x -> Integer.toBinaryString(x);
        fun.apply(1);

        /*testAll.testAdder(new Adder() {
            @Override
            public int add(int a, int b) {
                return 2+3;
            }
        },2,2);
*/ // this the the old way before java8

        Adder adderPlus = (a, b) -> 10 + 10; // we change the implemenatation

        testAll.testAdder(adderPlus, 1, 1);

        adderPlus.testDefault("jay");
    }
}
