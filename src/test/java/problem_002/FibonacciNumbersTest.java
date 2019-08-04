package problem_002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumbersTest {

    @Test
    public void testSumOfFibonacciEvenNumbers() {
        Assertions.assertEquals(4613732, FibonacciNumbers.getSumOfEvenFibonnaciNumbers(4000000));
    }
}
