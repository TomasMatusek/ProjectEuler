package projecteuler.problem_003;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    private List<Integer> primesOfNumber = new ArrayList<>();
    private long number;

    public PrimeFactor(long number) {
        this.number = number;
    }

    public List<Integer> getPrimeFactorsOfNumber() {
        return getPrimeFactorsOfNumber(1);
    }

    private List<Integer> getPrimeFactorsOfNumber(int primeIndex) {
        // Current prime number
        int primeNumber = getNthPrimeNumber(primeIndex);

        // If we hit bottom return result
        if (number < 2) {
            return primesOfNumber;
        }

        // Check if number can be divided by prime number
        // If yes divide number by this prime number and add it in the list
        if (number % primeNumber == 0) {
            primesOfNumber.add(primeNumber);
            number /= primeNumber;
            getPrimeFactorsOfNumber(getNthPrimeNumber(1));
        }
        // If not, then try to divide number by next prime number
        else {
            getPrimeFactorsOfNumber(++primeIndex);
        }

        // Return final list
        return primesOfNumber;
    }

    public static int getLargestPrimeFactorOf(long number) {
        List<Integer> primeFactors = new PrimeFactor(number).getPrimeFactorsOfNumber();
        return primeFactors.get(primeFactors.size() - 1);
    }

    public static Integer getNthPrimeNumber(int primeNumberPosition) {
        List<Integer> primes = getListOfFirstNPrimes(primeNumberPosition);
        return primes.get(primes.size() - 1);
    }

    public static List<Integer> getListOfFirstNPrimes(int numberOfPrimes) {
        List<Integer> primes = new ArrayList<>();
        int i = 0;
        while (true) {
            if (primes.size() == numberOfPrimes) break;
            if (isPrimeNumber(i)) primes.add(i);
            i++;
        }
        return primes;
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
