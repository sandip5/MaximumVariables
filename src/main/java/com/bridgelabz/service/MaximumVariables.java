package com.bridgelabz.service;

import java.util.Arrays;

public class MaximumVariables<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T searchMaximum(T... elements) {
        T[] variables= elements;
        int length = variables.length;
        Arrays.sort(variables);
        print(variables);
        System.out.println(variables[length-1]);
        return variables[length - 1];
    }
    public static <T> void print(T[] inputArray){
        for (T element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }
}