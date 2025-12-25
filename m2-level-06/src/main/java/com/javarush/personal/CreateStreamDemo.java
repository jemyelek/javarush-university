package com.javarush.personal;

import java.util.stream.Stream;

public class CreateStreamDemo {

    public static void main(String[] args) {

        Stream<String > stream1= Stream.of("b", "Z", "n", "Kk", "C");
        System.out.println(stream1.count());

        Stream<Double> stream2 = Stream.generate(Math::random).limit(4);
        stream2.forEach(System.out::println);

        Stream<String> streamA = Stream.of("a", "C", "d");
        Stream<String> streamB = Stream.of("1", "3", "5");
        Stream<String> streams = Stream.concat(streamA, streamB);
        streams.forEach(System.out::print);
    }
}
