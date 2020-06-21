package com.bridgelabz.service;

import java.util.Arrays;

public class MaximumVariables<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T searchMaximum(T... elements) {
        T[] variables= elements;
        int length = variables.length;
        Arrays.sort(variables);
        return variables[length - 1];
    }
}