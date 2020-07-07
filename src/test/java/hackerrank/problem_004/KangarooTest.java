package hackerrank.problem_004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KangarooTest {

    @Test
    public void Sample_Test_1() {
        Assertions.assertEquals("YES", Kangaroo.kangaroo(0, 3,4, 2));
    }

    @Test
    public void Sample_Test_2() {
        Assertions.assertEquals("NO", Kangaroo.kangaroo(0, 2,5, 3));
    }
}