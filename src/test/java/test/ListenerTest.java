package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {
    @Test
    public void aFailingTest() {
        System.out.println("Test started\n");
        Assert.fail("Failing deliberately");
    }
}
