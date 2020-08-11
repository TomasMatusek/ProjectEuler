package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collections_Problem {

    public static void test() {
        int[] arr = new int[] {1,2,3,4,5};
        Integer[] arr1 = new Integer[] {1,2,3,4,5};
        List<Integer> arr2 = Arrays.asList(1,2,3,4,5);

        // Generic type can't be replaced by primitive values, so we get this weird List<int[]>
        Stream<int[]> a = Stream.of(arr);
        List<int[]> b = Arrays.asList(arr);
        IntStream c = Arrays.stream(arr);
        List<int[]> d = Collections.singletonList(arr);

        Stream<List<Integer>> e = Stream.of(arr2);
        List<List<Integer>> f = Arrays.asList(arr2);
        List<List<Integer>> h = Collections.singletonList(arr2);

        // Must be boxed
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
    }
}