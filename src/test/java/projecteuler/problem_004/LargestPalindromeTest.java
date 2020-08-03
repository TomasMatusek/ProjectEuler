package projecteuler.problem_004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestPalindromeTest {

    @Test
    void When_9009IsProvided_Then_IsPalindromeResultIsTrue() {
        Assertions.assertTrue(LargestPalindrome.isPalindrome(9009));
    }

    @Test
    void When_2DigitGetLargestPalindrome_Then_9009IsReturned() {
        Assertions.assertEquals(9009, LargestPalindrome.getLargestPalindrome(2));
    }

    @Test
    void When_3DigitGetLargestPalindrome_Then_ResultIsReturned() {
        Assertions.assertEquals(906609, LargestPalindrome.getLargestPalindrome(3));
    }
}