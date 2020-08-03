package projecteuler.problem_003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PrimeFactorTest {

    @Test
    void calculateLargesPrimeFactorOfNumber_returnsLargestPrimeFactor() {
        Assertions.assertEquals(6857, PrimeFactor.getLargestPrimeFactorOf(600851475143L));
    }

    @Test
    void calculateLargesPrimeFactorOfNumber_returnsLargestPrimeFactor2() {
        Assertions.assertEquals(29, PrimeFactor.getLargestPrimeFactorOf(13195));
    }

    @Test
    void getPrimeFactorOfGivenNumber_returnCorrectListPrimeFactors2() {
        int[] expected = { 5,7,13,29 };
        List<Integer> primesOfNumber = new PrimeFactor(13195).getPrimeFactorsOfNumber();
        Assertions.assertArrayEquals(expected, primesOfNumber.stream().mapToInt(i -> i).toArray());
    }

    @Test
    void getPrimeFactorOfGivenNumber_returnCorrectListPrimeFactors() {
        int[] expected = { 5,7,13,29 };
        List<Integer> primesOfNumber = new PrimeFactor(13195).getPrimeFactorsOfNumber();
        Assertions.assertArrayEquals(expected, primesOfNumber.stream().mapToInt(i -> i).toArray());
    }

    @Test
    void getFirstNPrimeFactor() {
        int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71 };
        List<Integer> primes = PrimeFactor.getListOfFirstNPrimes(20);
        Assertions.assertArrayEquals(expected, primes.stream().mapToInt(i -> i).toArray());
    }

    @Test
    void isPrimeNumberTest() {
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
