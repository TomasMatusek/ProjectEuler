package problem_003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeFactorTest {

    @Test
    public void calculateLargesPrimeFactorOfNumber_returnsLargestPrimeFactor() {
        Assertions.assertEquals(29, PrimeFactor.getLargestPrimeFactorOf(13195));
    }

    @Test
    public void getPrimeFactorOfGivenNumber_returnCorrectListPrimeFactors() {
        int[] expected = { 5,7,13,29 };
        Assertions.assertArrayEquals(expected, PrimeFactor.getPrimeFactorsOfNumber(13195).stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void isPrimeNumberTest() {
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(2));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(3));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(5));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(7));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(11));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(13));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(17));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(19));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(23));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(29));
        Assertions.assertTrue(PrimeFactor.isPrimeNumber(31));

        //Assertions.assertFalse(PrimeFactor.isPrimeNumber(0));
        Assertions.assertFalse(PrimeFactor.isPrimeNumber(1));
        Assertions.assertFalse(PrimeFactor.isPrimeNumber(4));
        Assertions.assertFalse(PrimeFactor.isPrimeNumber(8));
        Assertions.assertFalse(PrimeFactor.isPrimeNumber(20));
        Assertions.assertFalse(PrimeFactor.isPrimeNumber(30));
    }
}
