package projecteuler.problem_004;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestPalindrome {

    public static int getLargestPalindrome(int n) {
        List<Integer> palindromes = getPalindromesOfNDigitNumber(n);
        Collections.sort(palindromes);
        return palindromes.size() > 0 ? palindromes.get(palindromes.size() - 1) : 0;
    }

    public static List<Integer> getPalindromesOfNDigitNumber(int n) {
        List<Integer> palindromes = new ArrayList<>();
        int largestNDigitNumber = LargestPalindrome.getLargestNumber(n);
        int numberOne = largestNDigitNumber;
        int numberTwo = largestNDigitNumber;

        while (true) {
            int candidate = numberOne * numberTwo;

            if (isPalindrome(candidate) && ! palindromes.contains(candidate)) {
                palindromes.add(candidate);
            }

            numberOne--;

            if (numberOne == 0) {
                numberOne = largestNDigitNumber;
                numberTwo--;
            }

            if (numberTwo == 0) {
                Collections.sort(palindromes);
                return palindromes;
            }
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