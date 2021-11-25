package DataStructure_Practice.all;


import java.util.*;

public class ItineraryExample {
    // https://www.geeksforgeeks.org/find-itinerary-from-a-given-list-of-tickets/

    private static void printResult(Map<String, String> dataSet) {

        // To store reverse of given map
        Map<String, String> reverseMap = new HashMap<String, String>();

        // To fill reverse map, iterate through the given map and put value and key
        for (Map.Entry<String, String> entry : dataSet.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());


        // Find the starting point of itinerary
        String start = null;
        for (Map.Entry<String, String> entry : dataSet.entrySet()) {
            if (!reverseMap.containsKey(entry.getKey())) {
                start = entry.getKey();
                break;
            }
        }

        // If we could not find a starting point, then something wrong
        // with input
        if (start == null) {
            System.out.println("Invalid Input");
            return;
        }

        // Once we have starting point, we simple need to go next, next of next using given hash map
        String to = dataSet.get(start);
        System.out.println("\nAfter ");
        while (to != null) {
            System.out.print(start + "->" + to + ", ");
            start = to;
            to = dataSet.get(to);
        }

    }

    public static void main(String[] args) {


        Map<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("Chennai", "Banglore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");

        List<String> fromList = Arrays.asList("Chennai,Bombay,Goa,Delhi".split(","));
        List<String> toList = Arrays.asList("Banglore,Delhi,Chennai,Goa".split(","));
        Map<String, String> map = new HashMap<String, String>();

//        for (int i=0; i<fromList.size(); i++) {
//            map.put(fromList.get(i), toList.get(i));
//        }
//
//
//        System.out.println(map);



        System.out.println("Original");
        for (Map.Entry<String, String> entry : dataSet.entrySet())
            System.out.print(entry.getKey() + "-->" + entry.getValue()+ ",");


        printResult(dataSet);
    }


}
