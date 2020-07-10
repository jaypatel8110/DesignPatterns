package LamdaExpressions;

@FunctionalInterface
public interface Adder {
    int add(int a , int b);

    static String jay(int i){
        return "Jay";
    }

    default void testDefault (String s){
        System.out.println("Dafault method is called");
    }


     static String teststatic (String s){
         System.out.println("Static  method is called");

        return s;
    }

    public int hashCode();

}
