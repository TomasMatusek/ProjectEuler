package hackerrank.problem_002;

import java.util.*;
import java.util.stream.LongStream;

public class MinimumLossProblem {

    public static int minimumLoss(long[] prices) {
        int smallestDifference = 0;
        for (int i = 0; i < prices.length; i++) {
            long buyPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                long sellPrice = prices[j];
                long priceDifference = buyPrice - sellPrice;
                if (priceDifference > 0 && (smallestDifference > priceDifference || smallestDifference == 0)) {
                    smallestDifference = (int) priceDifference;
                }
            }
        }
        return smallestDifference;
    }

    public static int minimumLoss2(long[] prices) {
        int sellPriceCounter = 0;
        int smallestDifference = 0;
        for (int i = 0; i < prices.length; i++) {
            long buyPrice = prices[i];
            long[] sellPrices = getLowestValue(i, prices, buyPrice);

            for (long sellPrice : sellPrices) {
                sellPriceCounter++;
                long priceDifference = buyPrice - sellPrice;
                if (priceDifference > 0 && (smallestDifference > priceDifference || smallestDifference == 0)) {
                    smallestDifference = (int) priceDifference;
                    System.out.println(String.format("Detail %s %s %s %s", buyPrice, sellPrice, priceDifference, smallestDifference));
                    break;
                }
            }
        }
        System.out.println(sellPriceCounter);
        return smallestDifference;
    }

    private static long[] getLowestValue(int currentPosition, long[] prices, long buyPrice) {
        long[] relevantPrices = Arrays.copyOfRange(prices, currentPosition + 1, prices.length);
        Arrays.sort(relevantPrices);
        return revertValue(relevantPrices);
    }

    public static long[] revertValue(long[] list) {
        long[] revertedList = new long[list.length];
        for (int i = 0; i < list.length; i++) {
            revertedList[i] = list[list.length - i -1];
        }
        return revertedList;
    }
}