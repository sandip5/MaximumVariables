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
    public Float searchMaximum(Float[] variables) {
        Float maximumVariable = 0.0f;
        for (Float element : variables) {
            if (element.compareTo(maximumVariable) > 0)
                maximumVariable = element;
        }
        return maximumVariable;
    }
    public String searchMaximum(String[] variables) {
        String maximumVariable = "";
        for (String element : variables) {
            if (element.compareTo(maximumVariable) > 0)
                maximumVariable = element;
        }
        return maximumVariable;
    }
}
