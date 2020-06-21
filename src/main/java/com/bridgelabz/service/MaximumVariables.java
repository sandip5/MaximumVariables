package com.bridgelabz.service;

public class MaximumVariables {
    public static <T extends Comparable<T>> T searchMaximum(T... elements) {
        T maximumVariable = elements[0];
        for (T element : elements) {
            if (element.compareTo(maximumVariable) > 0) {
                maximumVariable = element;
            }
        }
        return maximumVariable;
    }
}
