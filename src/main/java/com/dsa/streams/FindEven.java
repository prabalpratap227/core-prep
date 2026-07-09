package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEven {

    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5, 6};

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6);

        int[] evenNumbersArray = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();

        List<Integer> evenNumbersList = numbersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toUnmodifiableList());

        System.out.println(Arrays.toString(evenNumbersArray));

        System.out.println(Arrays.toString(evenNumbersList.toArray()));


    }
}
