package by.teachmesskils.yadevich.lesson18.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Task 2
 * Create an ArrayList class collection with the values of the names of all students in the group.
 * Using Streams:
 * - Select all names that start with any letter entered from the console (regardless of upper/lower case).
 * - Sort and return the first element of the collection.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Marina");
        students.add("Kate");
        students.add("Oleg");
        students.add("Kirill");
        students.add("Flaffic");
        students.add("Rita");
        students.add("Ilya");
        students.add("Flame-host");
        students.add("Dmitry");
        students.add("Vlad");
        students.add("Igor");
        students.add("Sergio");
        students.add("Dmitry");
        students.add("Daniil");
        students.add("Sultan");

        System.out.println(students);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one any letter: ");
        String letter = scanner.nextLine();
        scanner.close();

        if (letter == null || letter.isEmpty() || letter.matches("//d")) {
            System.out.println("Invalid line.");
        } else {

            List<String> studentsStream = students.stream()
                    .filter(p -> p.toLowerCase().startsWith(letter.toLowerCase()))
                    .toList();

            System.out.println(studentsStream);

            Optional<String> studentsStream1 = students.stream()
                    .sorted()
                    .findFirst();

            System.out.println(studentsStream1);
        }
    }
}
