package hackerrank.problem_001;

public class PlusMinutesProblem {

    public static double[] plusMinus(int[] numbers) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;
        for (int number : numbers) {
            if (number > 0)
                positiveNumbers++;
            else if (number < 0)
                negativeNumbers++;
            else
                zeroNumbers++;
        }

        return new double[] {
            (double) positiveNumbers / numbers.length,
            (double) negativeNumbers / numbers.length,
            (double) zeroNumbers / numbers.length
        };
    }
}
