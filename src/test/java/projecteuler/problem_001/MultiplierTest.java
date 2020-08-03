package projecteuler.problem_001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplierTest {

    @Test
    void sumOfMultipliers_3or5Limit1000_return233168() {
        Assertions.assertEquals(233168, Multiplier.getSumOfMultipliers(3,5,1000));
    }

    @Test
    void sumOfMultipliers_3or5Limit10_return23() {
        Assertions.assertEquals(23, Multiplier.getSumOfMultipliers(3,5,10));
    }
}
