package hackerrank.problem_005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormingMagicSquareTest {

    @Test
    public void SampleTestCase0() {
        int[][] matrix = {
            { 4, 9, 2 },
            { 3, 5, 7 },
            { 8, 1, 5 }
        };
        Assertions.assertEquals(1, FormingMagicSquare.formingMagicSquare(matrix));
    }

    @Test
    public void SampleTestCase1() {
        int[][] matrix = {
            { 4, 8, 2 },
            { 4, 5, 7 },
            { 6, 1, 6 }
        };
        Assertions.assertEquals(4, FormingMagicSquare.formingMagicSquare(matrix));
    }

}