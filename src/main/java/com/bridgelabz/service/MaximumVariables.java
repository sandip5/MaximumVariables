package com.bridgelabz.service;

import java.util.Set;

public class MaximumVariables<T extends Comparable<T>> {
    T firstVariable, secondVariable, thirdVariable;
    public MaximumVariables(T firstVariable, T secondVariable, T thirdVariable){
        this.firstVariable=firstVariable;
        this.secondVariable=secondVariable;
        this.thirdVariable=thirdVariable;
    }
    public T searchMaximum(){
        return MaximumVariables.searchMaximum(firstVariable,secondVariable,thirdVariable);
    }

    public static <T extends Comparable<T>> T searchMaximum(T firstVariable, T secondVariable, T thirdVariable) {
        if(firstVariable.compareTo(secondVariable) > 0 && firstVariable.compareTo(thirdVariable) > 0)
            return firstVariable;
        else if(secondVariable.compareTo(firstVariable) > 0 && secondVariable.compareTo(thirdVariable) > 0)
            return secondVariable;
        else
            return thirdVariable;
    }
}
