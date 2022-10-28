package Ejercicio10;

import java.util.ArrayDeque;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Ej10
{
    public static <T> Stream<T> reverse(Stream<T> stream)
    {
        return stream.collect(
                Collector.of(() -> new ArrayDeque<T>(),
                        ArrayDeque::addFirst,
                        (a, b) ->  a)
        ).stream();
    }

    public static void main(String[] args)
    {
        Stream<Integer> stream = Stream.of(15, 11, 12, 13, 12, 11, 10, 9, 8 ,7 , 6, 5, 4, 3, 2, 1);
        reverse(stream)
                .forEach(System.out::println);
    }
}
