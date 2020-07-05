package LamdaExpressions;

@FunctionalInterface
public interface Adder {
    int add(int a , int b);

    default void testThis (String s){
        System.out.println("Dafault method is called");
    }

     static String testThissds (String s){
         System.out.println("Static  method is called");

        return s;
    }


    public int hashCode();


}
