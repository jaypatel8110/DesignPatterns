package CustomException;

public class TestCustomException1 {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not valid");
        } else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {

        try {
            validate(14);
        }catch (Exception e){
            System.out.println("Exception occured: "+e);
        }finally {
            System.out.println("After code over");
        }

    }
}
