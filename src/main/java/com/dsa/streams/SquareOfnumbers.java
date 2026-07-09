package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SquareOfnumbers {

    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> squares = Arrays.stream(numbers).map(n -> n * n).boxed().collect(Collectors.toList());

        System.out.println(squares);

        System.out.println("Second Approach");

        Map<Integer, Integer> squareOfNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toMap(n -> n, n -> n * n));

        squareOfNumbers.forEach(( number, square) -> System.out.println( number + "->" + square));

    }
}
