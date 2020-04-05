package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] profits) {
        long sum = 0;
        for (long profit : profits) {
            sum += profit;
        }
        return sum;
    }

    public long findMiddle(long[] profits) {
        long sum = 0;
        for (long profit : profits) {
            sum += profit;
        }
        long middle = sum / 12;
        return middle;
    }


    public long findMax(long[] profits) {
        long currentMax = profits[0];
        int month = 0;
        int result =0;
        for (long profit : profits) {
            month = month + 1;
            if (currentMax < profit) {
                currentMax = profit;
                result=month;
            }
        }
        return result;
    }

    public long findMin(long[] profits) {
        long currentMin = profits[0];
        int month = 0;
        int result =0;
        for (long profit : profits) {
            month=month+1;
            if (currentMin > profit) {
                currentMin = profit;
                result=month;
            }
        }
        return result;
    }

    public long findUnderMid(long[] profits) {
        long middle = findMiddle(profits);
        long numbers = 0;
        for (long profit : profits) {
            if (profit < middle) {
                numbers = numbers + 1;
            }
        }
        return numbers;
    }

    public long findAboveMid(long[] profits) {
        long middle = findMiddle(profits);
        long numbers = 0;
        for (long profit : profits) {
            if (profit > middle) {
                numbers = numbers + 1;
            }
        }
        return numbers;

    }

}
