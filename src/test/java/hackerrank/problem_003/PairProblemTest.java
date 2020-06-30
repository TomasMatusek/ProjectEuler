package hackerrank.problem_003;

import helpers.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PairProblemTest {

    @Test
    public void Sample_Test_1() {
        Assertions.assertEquals(3, PairProblem.getNumberOfPairs(2, new long[] {1,5,3,4,2}));
    }

    @Test
    public void Sample_Test_3() {
        Assertions.assertEquals(5, PairProblem.getNumberOfPairs2(2, new int[] {1,3,5,8,6,4,2}));
    }

    @Test
    public void Sample_Test_2() {
        int[] testNumbers = new Utils().getTestingDataFromFile2("hackerrank.problem_003.txt");
        long startAt = System.currentTimeMillis();
        Assertions.assertEquals(46757, PairProblem.getNumberOfPairs2(793735, testNumbers));
        long time = (System.currentTimeMillis() - startAt) / 1000;
        System.out.println(String.format("Took %s ms", time));
    }
}