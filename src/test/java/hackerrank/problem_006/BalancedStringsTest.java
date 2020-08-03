package hackerrank.problem_006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedStringsTest {

    @Test
    public void testCase1() {
        assertTrue(BalancedStrings.isParenthesesStringBalanced("{}()"));
    }

    @Test
    public void testCase2() {
        assertTrue(BalancedStrings.isParenthesesStringBalanced("({()})"));
    }

    @Test
    public void testCase3() {
        assertFalse(BalancedStrings.isParenthesesStringBalanced("{}("));
    }

    @Test
    public void testCase4() {
        assertTrue(BalancedStrings.isParenthesesStringBalanced("[]"));
    }

    @Test
    public void testCase5() {
        assertFalse(BalancedStrings.isParenthesesStringBalanced("({)}"));
    }

    @Test
    public void testCase6() {
        assertFalse(BalancedStrings.isParenthesesStringBalanced("}{"));
    }

    @Test
    public void testCase7() {
        assertFalse(BalancedStrings.isParenthesesStringBalanced("[["));
    }

    @Test
    public void testCase8() {
        assertTrue(BalancedStrings.isParenthesesStringBalanced(""));
    }

    @Test
    public void testCase9() {
        assertTrue(BalancedStrings.isParenthesesStringBalanced("({})"));
    }
}