package hackerrank.problem_003;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PairProblem {

    // Slow one
    public static int getNumberOfPairs(int difference, long[] arr) {
        int diffFoundCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] - arr[j]) == difference) {
                    diffFoundCounter++;
                }
            }
        }
        return diffFoundCounter;
    }

    // Fast one
    public static int getNumberOfPairs2(int k, int[] arr) {
        final Set set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int diffFoundCounter = 0;
        for (int value : arr) {
            if (set.contains(value + k)) {
                diffFoundCounter++;
            }
        }
        return diffFoundCounter;
    }
}