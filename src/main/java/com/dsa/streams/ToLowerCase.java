package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCase {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Cat", "PaRRot", "ZaDEN");

        List<String> toLowerCase = names.stream().map(String :: toLowerCase).collect(Collectors.toUnmodifiableList());

        System.out.println(toLowerCase);
    }
}
