package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxAndMinNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 4, 3, 45, 65, 34, 34, 12, 34);

        Optional<Integer> maxNumber = numbers.stream().max(Integer :: compareTo);

        Optional<Integer> minNumber = numbers.stream().min(Integer :: compareTo);

        System.out.println(maxNumber);

        System.out.println(minNumber);
    }
}
