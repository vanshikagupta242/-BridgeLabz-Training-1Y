package gla.com.streamapi;

import java.util.stream.Stream;
import java.util.*;java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Stream;

public class streamapi {
    public static void main(String[] args) {
        //first way to create stream()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.forEach(n -> System.out.println(n));

        Stream<String> stream1 = Stream.of("aa", "bb", "cc");
        stream1.forEach(System.out::println);

        //second way to create stream using stream()
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(32);
        al.add(4);
        al.add(2);
        System.out.println("---------Using stream()--------");
        Stream<Integer> stm = al.stream();
        stm.forEach(n -> System.out.println(n));

        ArrayList<String> list = new ArrayList<>();
        list.add("vanshika");
        list.add("ishika");
        list.add("drishya");
        list.add("anushka");
        list.add("Rishika");
        list.add("Anu");
        list.add("Bittu");
        list.add("Daksh");
        list.add("utkarsh");
        //Stream<String> stream2 = list.stream();
        //Stream<String> FilterStream = stream2.filter(n -> n.startsWith("A"));
        //FilterStream.forEach(System.out::println);
        list.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
    }
}


