package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Dante");
        Consumer<String> printer = s -> System.out.println(s);
        strings.forEach(printer);

        //create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square); // [4, 9, 16, 25]

        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        System.out.println(names); // [Reflection, Collection, Stream]

        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result); // [Stream]

        List<String> abc = Arrays.asList("b","a","c","d","z","j");
        List<String> show = abc.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        List<Integer> in = Arrays.asList(3,4,5,6,7,8,9,1,2);
        List<Integer> sort = in.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        Set<Integer> squareSet = number.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        Set<Integer> squareSet1 = in.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet1);

        number.stream().map(x -> x * x).forEach(y -> System.out.print(y + " "));

        System.out.println();
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even); // 6

    }
}
