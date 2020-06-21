package com.bridgelabz.test;

import com.bridgelabz.service.MaximumVariables;
import org.junit.Assert;
import org.junit.Test;

public class MaximumVariablesTest {
    MaximumVariables maximumVariablesObject =new MaximumVariables();
    @Test
    public void givenIntegerVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Integer[] variables = {123, 63, 92};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[0]);
    }
    @Test
    public void givenIntegerVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Integer[] variables = {123, 180, 92};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[1]);
    }
    @Test
    public void givenIntegerVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Integer[] variables = {123, 180, 921};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[2]);
    }
    @Test
    public void givenFloatVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Float[] variables = {123.5f, 63.2f, 92.0f};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[0]);
    }
    @Test
    public void givenFloatVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Float[] variables = {123.5f, 635.2f, 92.0f};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[1]);
    }
    @Test
    public void givenFloatVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Float[] variables = {123.5f, 63.2f, 921.034f};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[2]);
    }
    @Test
    public void givenStringVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        String[] variables = {"Peach", "Apple", "Banana"};
        Assert.assertEquals("Peach", maximumVariablesObject.searchMaximum(variables));
    }
    @Test
    public void givenStringVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        String[] variables = {"Apple", "Peach", "Banana"};
        Assert.assertEquals("Peach", maximumVariablesObject.searchMaximum(variables));
    }
    @Test
    public void givenStringVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        String[] variables = {"Apple", "Banana", "Peach"};
        Assert.assertEquals("Peach", maximumVariablesObject.searchMaximum(variables));
    }

}
