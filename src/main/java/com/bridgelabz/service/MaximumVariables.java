package com.bridgelabz.service;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class MaximumVariables<T> {
    public T searchMaximum(T... elements) {
        T[] variables = elements;
        int length = variables.length;
        Arrays.sort(variables);
        print(variables);
        System.out.println(variables[length - 1]);
        return variables[length - 1];
    }
    public void print(T[] inputArray) {
        for (T element : inputArray)
            System.out.printf("%s ", element);
        System.out.println();
    }
}