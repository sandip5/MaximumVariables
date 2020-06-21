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
}
