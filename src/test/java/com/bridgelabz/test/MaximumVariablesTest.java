package com.bridgelabz.test;

import com.bridgelabz.service.MaximumVariables;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("ALL")
public class MaximumVariablesTest {
    MaximumVariables maximum=new MaximumVariables();
    @Test
    public void givenIntegerVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(123, maximum.searchMaximum(123, 63, 92));
    }
    @Test
    public void givenIntegerVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(180, maximum.searchMaximum(123, 180, 92));
    }
    @Test
    public void givenIntegerVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(921, maximum.searchMaximum(123, 180, 921));
    }
    @Test
    public void givenMoreThanThreeIntegerVariable_WhenProper_ShouldReturnTrue() {
        Assert.assertEquals(1230, maximum.searchMaximum(123, 180, 921,1230,56));
    }
    @Test
    public void givenFloatVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(123.5f, maximum.searchMaximum(123.5f, 63.2f, 92.0f));
    }
    @Test
    public void givenFloatVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(635.2f, maximum.searchMaximum(123.5f, 635.2f, 92.0f));
    }
    @Test
    public void givenFloatVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(921.034f, maximum.searchMaximum(123.5f, 63.2f, 921.034f));
    }
    @Test
    public void givenMoreThanThreeFloatVariable_WhenProper_ShouldReturnTrue() {
        Assert.assertEquals(921.034f, maximum.searchMaximum(123.5f, 63.2f, 921.034f,646.45f,894.00045f));
    }
    @Test
    public void givenStringVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach", maximum.searchMaximum("Peach", "Apple", "Banana"));
    }
    @Test
    public void givenStringVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach", maximum.searchMaximum("Apple", "Peach", "Banana"));
    }
    @Test
    public void givenStringVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach", maximum.searchMaximum("Apple", "Banana", "Peach"));
    }
    @Test
    public void givenMoreThanThreeStringVariable_WhenProper_ShouldReturnTrue() {
        Assert.assertEquals("Peach", maximum.searchMaximum("Apple", "Banana", "Peach","Go"));
    }
}
