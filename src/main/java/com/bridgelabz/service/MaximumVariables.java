package com.bridgelabz.service;

public class MaximumVariables {
    public Integer searchMaximum(Integer[] variables) {
        int maximumVariable = 0;
        for (Integer element : variables) {
            if (element.compareTo(maximumVariable) > 0)
                maximumVariable = element;
        }
        return maximumVariable;
    }
}
