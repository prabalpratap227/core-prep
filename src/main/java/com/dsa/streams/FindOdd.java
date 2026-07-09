package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {

    public static void main(String[] args){

        int[] numbersArray = {1, 2, 3, 4, 5, 6};

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6);

        int[] oddNumbersArray = Arrays.stream(numbersArray).filter(n -> n % 2 != 0).toArray();

        List<Integer>  oddNumbersList = numberList.stream().filter(n -> n % 2 != 0).collect(Collectors.toUnmodifiableList());

        for(Integer num : oddNumbersList){

            System.out.print(num + ", ");
        }
    }
}
