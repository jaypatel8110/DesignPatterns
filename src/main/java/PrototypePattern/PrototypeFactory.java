package PrototypePattern;

public class PrototypeFactory {

    private static java.util.Map<String, PrototypeCapable> prototypesMap = new java.util.HashMap<String, PrototypeCapable>();

    static {
        prototypesMap.put(Names.MOVIE.getvalue(), new Movie());
        prototypesMap.put(Names.ALBUM.getvalue(), new Album());
        prototypesMap.put(Names.SHOW.getvalue(), new Show());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {

        return ((PrototypeCapable) prototypesMap.get(s)).clone();

    }
}
