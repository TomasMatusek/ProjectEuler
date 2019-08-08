package problem_003;

import java.util.Collections;
import java.util.List;

public class PrimeFactor {

    public static int getLargestPrimeFactorOf(int number) {
        return 0;
    }

    public static List<Integer> getPrimeFactorsOfNumber(int number) {
        return Collections.emptyList();
    }

    public static boolean isPrimeNumber(int number) {
        if (number - 1 < 1) return false;
        for (int i = (number - 1); i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
