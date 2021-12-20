package Utils;

import Utils.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListUtils {
    static List<String> countryList= List.of(StringUtils.countryStrings.split(","));



    public static void main(String[] args) {

        for (String s: countryList) {
            System.out.println(s);
        }

        /*
        *   String str = "[1,2,356,678,3378]";

        // calling replaceAll() method and split() method on
        // string
        String[] string = str.replaceAll("\\[", "")
                              .replaceAll("]", "")
                              .split(",");

        // declaring an array with the size of string
        int[] arr = new int[string.length];

        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
        *
        * String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];

        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        *
        * new
        *
        * int[] result = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        *
        *
        * new
        *
        * List<String> list = Arrays.asList( "-1" , "2", "3", "4", "5" );

        List<Integer> newList = list.stream()
                                    .map(s -> Integer.parseInt(s))
                                    .collect(Collectors.toList());

        * */
    }
}
