package projecteuler.problem_002;

public class FibonacciNumbers {
    public static int getSumOfEvenFibonnaciNumbers(int limit) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;

        while (true) {
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

            if (nextNumber > limit) {
                break;
            }

            if (nextNumber % 2 == 0) {
                sum += nextNumber;
            }

            System.out.println(String.format("%s, %s", nextNumber, sum));
        }

        return sum;
    }

}