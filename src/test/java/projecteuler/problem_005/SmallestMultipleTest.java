package projecteuler.problem_005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestMultipleTest {

    @Test
    public void sampleTest() {
        Assertions.assertEquals(2520, SmallestMultiple.getSmallestMultipleForNumber(1,10));
    }

    @Test
    public void actualTest() {
        Assertions.assertEquals(0, SmallestMultiple.getSmallestMultipleForNumber(1,20));
    }

}