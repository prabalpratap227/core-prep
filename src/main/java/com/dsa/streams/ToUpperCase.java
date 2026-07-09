package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("apple", "banana", "carrot");

        List<String> upperCaseNames = names.stream().map(String :: toUpperCase).collect(Collectors.toUnmodifiableList());

        System.out.println(upperCaseNames);
    }
}
