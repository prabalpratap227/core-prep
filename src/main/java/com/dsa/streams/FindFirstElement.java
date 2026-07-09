package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 32, 3, 4, 5, 6, 6, 7);

        Optional<Integer> firstElement = numbers.stream().findFirst();

        Optional<Integer> anyElement = numbers.stream().findAny();

        System.out.println("First Element");
        System.out.println(firstElement);

        System.out.println("Any Element");
        System.out.println(anyElement);
    }
}
