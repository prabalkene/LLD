package org.example;

import org.example.generics.Dog;
import org.example.generics.Gen1;
import org.example.generics.Gen2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
         Dog d  = new Dog();
         d.getAdded();
        Gen1 g = new Gen1<Integer>();
        g.<String>setb("Gen1");
        g.gen1();
        g.seta(4);
        g.gen2();
        List<Integer> list = List.of(1,3,4,5,87, 5, 3);
        int x = list.stream().max(Integer::compare).get();
        List<Integer> y = list.stream().map(Integer::intValue).collect(Collectors.toList());
        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris",
                "Charlie Lou");

        List<String> name = fullNames.stream().map( s -> s.split(" ")[0]).collect(Collectors.toList());
        List<Integer> peekedAtNumbers = list.stream().skip(3)
                .peek(System.out::println)
                .collect(Collectors.toList());
        Set<Integer> set = list.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println("set" + set);
        IntSummaryStatistics stats = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();


        System.out.println("max" + x + y + " " + name + " "+ peekedAtNumbers  + " " + stats);
        String input = "Java Articles are Awesome";
        IntStream k = input.chars();
        Stream<Integer> sc = k.boxed();
        sc.forEach(System.out::println);
        Character result = Arrays.stream(input.chars().toArray())
                .mapToObj(s -> Character.toLowerCase((char)(int)s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        int[] j = {2,3,4,4};
        Map<Integer, List<Integer>> map = Arrays.stream(j).boxed().collect(Collectors.groupingBy(Function.identity()));
        System.out.println(map);
        Y obj = new Y();
        obj.f();
        obj.getLeader();
        obj.getBulbOn();
    }
}