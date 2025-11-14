package org.example.generics;

import java.util.Scanner;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class DockerCheck {


    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Get first no.");
//
//        int a = sc.nextInt();
//        System.out.println("Get next no.");
//        int b = sc.nextInt();
//
//        int c = a + b;



        List<Integer> ints =  List.of(2,3,3,4,4,5,5,7);
        System.out.println("great");

        ints.stream().forEach( (in) -> {  if(in % 2 ==0) System.out.print(in); else  System.out.println("odd");});

        List<String>  str = List.of("huio", "pkigujj");

        str.stream().map((s) -> new String(s.replaceFirst(s.split("")[s.length()-1], s.split("")[s.length()-1].toUpperCase()))).forEach(System.out::println);

        ints.stream().sorted((i, n) ->Integer.compare(n,i)).forEach(System.out::println);

        System.out.println(ints.stream().reduce(9 ,Integer::sum));

        ExecutorService exe = Executors.newFixedThreadPool(3);

        for(int i=0; i< 4 ; i++) {
            exe.submit(() -> {

                System.out.println("Hey pk! howdy.");

            });
        }





    }

}
