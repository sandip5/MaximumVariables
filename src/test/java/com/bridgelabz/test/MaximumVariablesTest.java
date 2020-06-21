package com.bridgelabz.test;

import com.bridgelabz.service.MaximumVariables;
import org.junit.Assert;
import org.junit.Test;

public class MaximumVariablesTest {
    @Test
    public void givenIntegerVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum(123, 63, 92);
        Assert.assertEquals(123, maximum);
    }
    @Test
    public void givenIntegerVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum(123, 180, 92);
        Assert.assertEquals(180, maximum);
    }
    @Test
    public void givenIntegerVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum(123, 180, 921);
        Assert.assertEquals(921, maximum);
    }
    @Test
    public void givenFloatVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum(123.5f, 63.2f, 92.0f);
        Assert.assertEquals(123.5f, maximum);
    }
    @Test
    public void givenFloatVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum(123.5f, 635.2f, 92.0f);
        Assert.assertEquals(635.2f, maximum);
    }
    @Test
    public void givenFloatVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum(123.5f, 63.2f, 921.034f);
        Assert.assertEquals(921.034f, maximum);
    }
    @Test
    public void givenStringVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void givenStringVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void givenStringVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximum);
    }

}
