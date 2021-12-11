package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExmp {

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue()+b.doubleValue();
    }
    public static <Thing> void printArray(Thing[] thing){
        for (Thing t: thing){
            System.out.print(t);
        }
        System.out.println();
    }

    public static <T> void addSmart(T[] a ){
    }

    public static void main(String[] args) {
        System.out.println(add(2, 4));
        System.out.println(add(2.1, 4.1));

        //ArrayList
        Integer[] integers={1,2,3,4};
        String[] strings={"Jay","Patel"};
        printArray(integers);

        MyGenericClass<String> stringMyGenericClass= new MyGenericClass<String>("1");
        MyGenericClass<Integer> integerMyGenericClass= new MyGenericClass<Integer>(2);

    }
}
