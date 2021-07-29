package java.Streams.Maps;

import java.util.HashMap;
import java.util.Map;

public class All {
    public static void main(String[] args) {

        Map<String, Integer> myMap= new HashMap<>();
        myMap.put("vishal", 10);
        myMap.put("vishal", 11);
        myMap.put("sachin", 30);
        myMap.put("vaibhav", 20);

        myMap.merge("vishal", 1, Integer::sum);
    }
}
