package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOddEven {

    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        Map<Boolean, List<Integer>> oddEvenMapFromArray = numbersList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0 ));

        System.out.println("even numbers" + oddEvenMapFromArray.get(true));

        System.out.println("odd numbers" + oddEvenMapFromArray.get(false));
    }
}
