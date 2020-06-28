package com.designpatterns.Creational.PrototypePattern;

import java.util.Comparator;
import java.util.function.Function;

public class TestPrototypePattern {

    public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(Names.MOVIE.getvalue()).toString();
            System.out.println(moviePrototype);

            String albumPrototype  = PrototypeFactory.getInstance(Names.ALBUM.getvalue()).toString();
            System.out.println(albumPrototype);

            String showPrototype  = PrototypeFactory.getInstance(Names.SHOW.getvalue()).toString();
            System.out.println(showPrototype);
            Comparator<Show> s = (o1, o2) -> Integer.parseInt("sd");

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
