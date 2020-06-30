package hackerrank.problem_001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusMinutesProblemTest {
    @Test
    public void When_Then() {
        double[] result = PlusMinutesProblem.plusMinus(new int[]{1, 1, 0, -1, -1});
        Assertions.assertEquals(3, result.length);
        Assertions.assertEquals(0.4, result[0]);
        Assertions.assertEquals(0.4, result[1]);
        Assertions.assertEquals(0.2, result[2]);
    }
}