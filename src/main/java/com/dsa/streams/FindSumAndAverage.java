package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindSumAndAverage {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 23, 4, 34, 34, 12, 45, 45, 32);

        int sumOfNumbers = numbers.stream().mapToInt(Integer :: intValue).sum();

        System.out.print("SUM :");
        System.out.println(sumOfNumbers);

        OptionalDouble averageOfNumbers = numbers.stream().mapToInt(Integer :: intValue).average();

        System.out.print("Average :");
        System.out.println(averageOfNumbers);

    }
}
