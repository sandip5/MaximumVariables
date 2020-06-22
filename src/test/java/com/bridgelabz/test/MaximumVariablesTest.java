package com.bridgelabz.test;

import com.bridgelabz.service.MaximumVariables;
import org.junit.Assert;
import org.junit.Test;

public class MaximumVariablesTest {;
    @Test
    public void givenIntegerVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(123, (Comparable) new MaximumVariables(123,63,92).searchMaximum());
    }
    @Test
    public void givenIntegerVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(180,(Comparable) new MaximumVariables(92,180,30).searchMaximum());
    }
    @Test
    public void givenIntegerVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(921,(Comparable) new MaximumVariables(123,180,921).searchMaximum());
    }
    @Test
    public void givenFloatVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(123.5f,(Comparable) new MaximumVariables(123.5f, 63.2f, 92.0f).searchMaximum());
    }
    @Test
    public void givenFloatVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(635.2f,(Comparable) new MaximumVariables(123.5f, 635.2f, 92.0f).searchMaximum());
    }
    @Test
    public void givenFloatVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(921.034f,(Comparable) new MaximumVariables(123.5f, 63.2f, 921.034f).searchMaximum());
    }
    @Test
    public void givenStringVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach",(Comparable) new MaximumVariables("Peach", "Apple", "Banana").searchMaximum());
    }
    @Test
    public void givenStringVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach",(Comparable) new MaximumVariables("Apple", "Peach", "Banana").searchMaximum());
    }
    @Test
    public void givenStringVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach",(Comparable) new MaximumVariables( "Apple", "Banana", "Peach").searchMaximum());
    }

}
