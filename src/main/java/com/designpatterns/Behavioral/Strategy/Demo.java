package com.designpatterns.Behavioral.Strategy;
//https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/
public class Demo {

    public static void main(String[] args) {

        SocialMediaContext context=new SocialMediaContext();
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Jay ");

        System.out.println("====================");


        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Prerna");

        System.out.println("====================");

    }
}
