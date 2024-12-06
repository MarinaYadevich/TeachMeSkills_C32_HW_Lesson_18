package by.teachmesskils.yadevich.lesson18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Task 1
 * Create a collection of the ArrayList class and fill it with random elements of the Integer type.
 * Using Streams:
 * - Remove duplicates.
 * - Output all even elements in the range from 7 to 17 (inclusive).
 * - Multiply each element by 2.
 * - Sort and output the first 4 elements.
 * - Output the number of elements in the stream.
 * - Output the arithmetic mean of all numbers in the stream.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            Random random = new Random(); // нашла в гугле
            int integer = random.nextInt(100 - 1) + 1;
            integers.add(integer);
        }
        System.out.println(integers);

        // Remove duplicates.
        Stream<Integer> integerStream = integers.stream()
                .distinct();

        System.out.println("Output numbers without duplicates = " + integerStream.toList());

        // Output all even elements in the range from 7 to 17 (inclusive).
        Stream<Integer> integerStream1 = integers.stream()
                .filter(n -> (7 <= n && n <= 17) && n % 2 == 0);

        System.out.println("Output of even numbers from 7 to 17 = " + integerStream1.toList());

        // Multiply each element by 2.
        List<Integer> integerStream2 = integers.stream()
                .map(p -> p * 2)
                .toList();

        System.out.println("Output each element multiplied by 2 = " + integerStream2);

        // Sort and output the first 4 elements.
        List<Integer> integerStream3 = integers.stream()
                .sorted()
                .limit(4)
                .toList();

        System.out.println("Output first 4 numbers in sorted collection = " + integerStream3);

        // Output the number of elements in the stream.
        long integerStream4 = integers.size();

        System.out.println("Output number of elements = " + integerStream4);

        // Output the arithmetic mean of all numbers in the stream.
        // посмотрела в интернете
        double integerStream5 = integers.stream()
                .mapToInt(p -> p) // преобразовывает поток объектов типа Integer в поток примитивные типы данных int
                .average()
                .orElse(0);

        double average = Math.round(integerStream5 * 100.0) / 100.0;
        System.out.println("Output of the arithmetic mean of numbers = " + average);
    }
}
