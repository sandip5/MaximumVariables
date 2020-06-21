package com.bridgelabz.test;

import com.bridgelabz.service.MaximumVariables;
import org.junit.Assert;
import org.junit.Test;

public class MaximumVariablesTest {
    MaximumVariables maximumVariablesObject =new MaximumVariables();
    @Test
    public void givenNumber_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Integer[] variables = {123, 63, 92};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[0]);
    }
    @Test
    public void givenNumber_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Integer[] variables = {123, 180, 92};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[1]);
    }
    @Test
    public void givenNumber_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Integer[] variables = {123, 180, 921};
        Assert.assertEquals(maximumVariablesObject.searchMaximum(variables), variables[2]);
    }
}
