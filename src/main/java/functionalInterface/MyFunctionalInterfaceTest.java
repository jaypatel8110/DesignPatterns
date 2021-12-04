package functionalInterface;

import DataStructure_Practice.heap.MinHeap;
import org.w3c.dom.ls.LSOutput;

public class MyFunctionalInterfaceTest {

    // Implementing abstract method
    static MyFunctionalInterface booleanMyFunctionalInterface = (a, b) -> {
        if (a > b) return true;
        else return false;
    };


    public static void main(String[] args) {
        // Calling abstract method
        boolean res = booleanMyFunctionalInterface.compare(2, 3);
        System.out.println("Function Example " + res);

        // Calling static
        MyFunctionalInterface.testStatic("2");

        booleanMyFunctionalInterface.testDefault("3");
    }


}
