package functionalInterface.Supplier;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

        Supplier<Car> carSupplier=() -> new Car("Ford", 1500, 4, 43000);

    }
}
