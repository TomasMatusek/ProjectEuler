package problem_001;

class Multiplier {
    static int getSumOfMultipliers(int multiplier, int multiplier2, int limit) {
        int sum = 0;
        for (int i = 0; i <= limit - 1; i++) {
            if (i % multiplier == 0 || i % multiplier2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
