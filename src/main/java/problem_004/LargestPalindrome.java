package problem_004;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestPalindrome {

    public static int getLargestPalindrome(int n) {
        int numberOne = LargestPalindrome.getLargestNumber(n);
        int numberTwo = LargestPalindrome.getLargestNumber(n);

        boolean decreaseFirstNumber = true;
        while (true) {
            int candidate = numberOne * numberTwo;

            System.out.println(String.format("numberOne: %s, numberTwo: %s, candidate: %s, isPalindrome: %s", numberOne, numberTwo, candidate, isPalindrome(candidate)));

            if (isPalindrome(candidate)) {
                return candidate;
            }

            if (decreaseFirstNumber) {
                decreaseFirstNumber = false;
                numberOne--;
            } else {
                decreaseFirstNumber = true;
                numberTwo--;
            }

            if (candidate == 0)
                return 0;
        }
    }

    public static boolean isPalindrome(int number) {
        char[] numbers = String.valueOf(number).toCharArray();

        String numberBackward = IntStream.range(1, numbers.length + 1)
                .mapToObj(i -> String.valueOf(numbers[numbers.length - i]))
                .collect(Collectors.joining(""));

        return String.valueOf(number).equalsIgnoreCase(numberBackward);
    }

    public static Integer getLargestNumber(int digits) {
        String largestNumber = IntStream.range(1, digits + 1).mapToObj(i -> "9").collect(Collectors.joining(""));
        return Integer.valueOf(largestNumber);
    }
}