package LamdaExpressions;

import java.util.Comparator;
import java.util.function.Consumer;

public class TestAll {

    public void testAdder(Adder adder,int a , int b) {

        int sum = adder.add(a, b);
        System.out.println("Result :" + sum);
    }

    public static void main(String[] args) {

        //test addder
        TestAll testAll=new TestAll();
        testAll.testAdder((a, b) -> a+b,2,3);

        testAll.testAdder((int a, int b) -> {
                    String j="J";
                    String aa="A";
                    String y="Y";
                    System.out.println("this is more logic inside "+j+aa+y);
                    return a+b;
                }
                ,2,3);

        /*testAll.testAdder(new Adder() {
            @Override
            public int add(int a, int b) {
                return 2+3;
            }
        },2,2);
*/ // this the the old way before java8

        Adder adderPlus=(a, b) -> 10+10; // we change the implemenatation

        testAll.testAdder(adderPlus,1,1);

        adderPlus.testThis("jay");



    }
}
