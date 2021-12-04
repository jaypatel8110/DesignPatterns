package functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {

    // Only one abstract method allowed
    Boolean compare(int a, int b);

    // Since a default method have an implementation, it's not abstract.
    default String testDefault (String s){
        System.out.println("Default method is called");
        return s;
    }
    default void testDefault2 (String s){
        System.out.println("Default method is called");
    }


    // Can have multiple static methods
    static String testStatic (String s){
        System.out.println("Static method is called");
        return s;
    }
    static Boolean testStatic2 (Boolean b){
        System.out.println("Static2  method is called");
        return b;
    }

    // We can override parent abstract method
    public int hashCode();
}
