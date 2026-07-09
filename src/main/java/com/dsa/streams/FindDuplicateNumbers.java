package com.dsa.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9};

        Set<Integer> duplicate = new HashSet<>();

        Arrays.stream(numbers).filter(n -> !duplicate.add(n)).forEach(System.out::println);
    }
}
