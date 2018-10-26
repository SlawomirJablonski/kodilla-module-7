package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .forEach(System.out::println);

        OptionalDouble averageAsOptionalDouble = IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .average();

        Double average = averageAsOptionalDouble.getAsDouble();
        return average;

    }
}

