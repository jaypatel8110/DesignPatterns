package com.designpatterns.Java8DesignPatterns.Comparator.Factory;

import java.awt.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface Factory<T> extends Supplier<T> {

    default T newInstance() {
        return get();
    }

    default List<T> create5() {
        return IntStream.range(0, 5)
                .mapToObj(value -> newInstance())
                .collect(Collectors.toList());
    }

    static <T> Factory<T> createFactory(Supplier<T> supplier) {
        return () -> supplier.get();
    }

    static <T,P> Factory<T> createFactory(Function<P, T> constuctor, P color) {
        return () -> constuctor.apply(color);
    }

}
