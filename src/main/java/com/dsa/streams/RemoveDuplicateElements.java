package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8, 8, 9, 9);

        List<Integer> uniqueList = numbers.stream().distinct().collect(Collectors.toUnmodifiableList());

        System.out.println(uniqueList);
    }
}
