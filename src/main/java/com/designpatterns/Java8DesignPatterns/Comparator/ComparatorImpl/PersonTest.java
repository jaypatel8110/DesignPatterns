package com.designpatterns.Java8DesignPatterns.Comparator.ComparatorImpl;

import com.designpatterns.Java8DesignPatterns.Comparator.Util.Comparator;

import java.util.function.Function;

public class PersonTest {

    public static void main(String[] args) {

        Person  jay= new Person("Jay" ,27);
        Person  jayOld= new Person("Jay" ,28);
        Person  prerna= new Person("Prerna" ,26);
        Person  dad= new Person("Dad" ,27);
        Person  mom= new Person("Mom" ,26);

        Function<Person,String> getName= Person::getName;
        Function<Person,Integer> getAge= Person::getAge;

        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpAge = Comparator.comparing(getAge);
        Comparator<Person> cmpReverse = cmpName.reversed();
        Comparator<Person> cmpReverseThen = cmpName.thenComparing(cmpAge);

        Comparator<Person> finalCMP=
                Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge);


        System.out.println(" Jay > Prerna " +(cmpName.compare(jay,prerna)>1));
        System.out.println(" Mom > DAD " +(cmpName.compare(mom,dad)>1));
        System.out.println(" Jay > Bigjay " +(cmpReverseThen.compare(jay,jayOld)> 0));
        System.out.println(" Jay > Bigjay " +(finalCMP.compare(jay,jayOld)> 0));

    }

}
