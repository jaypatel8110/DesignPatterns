package com.designpatterns.Java8DesignPatterns.Comparator.Util;

import com.designpatterns.Java8DesignPatterns.Comparator.ComparatorImpl.Person;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {


    int compare(T s1, T s2);

    default Comparator<T> reversed(){
        return (s1, s2) -> this.compare(s2,s1);
    }

    default Comparator<T> thenComparing(Comparator<T> other){
        Objects.requireNonNull(other);
        return (T s1, T s2) -> {
            if(this.compare(s1,s2)==0){
           return other.compare(s1,s2);
            }
            return  1;
        };
    }

    default <U extends Comparable<? super U> > Comparator<T> thenComparing(Function<T, U> keyExtractor){
        Objects.requireNonNull(keyExtractor);
        Comparator<T> other = comparing(keyExtractor);
        return this.thenComparing(other);

    }

    static <T,U extends Comparable<? super U>> Comparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (s1, s2) ->  {
            U p1 =keyExtractor.apply(s1);
            U p2= keyExtractor.apply(s2);
            return p1.compareTo(p2);
        };
    }



}
