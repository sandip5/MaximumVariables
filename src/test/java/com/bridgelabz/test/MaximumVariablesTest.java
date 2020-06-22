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
        Assert.assertEquals(180, (Comparable)MaximumVariables.searchMaximum(123, 180, 92));
    }
    @Test
    public void givenIntegerVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(921, (Comparable)MaximumVariables.searchMaximum(123, 180, 921));
    }
    @Test
    public void givenFloatVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(123.5f, (Comparable)MaximumVariables.searchMaximum(123.5f, 63.2f, 92.0f));
    }
    @Test
    public void givenFloatVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum(123.5f, 635.2f, 92.0f);
        Assert.assertEquals(635.2f, (Comparable)MaximumVariables.searchMaximum(123.5f, 635.2f, 92.0f));
    }
    @Test
    public void givenFloatVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals(921.034f, (Comparable)MaximumVariables.searchMaximum(123.5f, 63.2f, 921.034f));
    }
    @Test
    public void givenStringVariable_AtFirstPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach", (Comparable)MaximumVariables.searchMaximum("Peach", "Apple", "Banana"));
    }
    @Test
    public void givenStringVariable_AtSecondPosition_WhenMaximum_ShouldReturnTrue() {
        Assert.assertEquals("Peach", (Comparable)MaximumVariables.searchMaximum("Apple", "Peach", "Banana"));
    }
    @Test
    public void givenStringVariable_AtThirdPosition_WhenMaximum_ShouldReturnTrue() {
        Comparable maximum = MaximumVariables.searchMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", (Comparable)MaximumVariables.searchMaximum("Apple", "Banana", "Peach"));
    }

}
