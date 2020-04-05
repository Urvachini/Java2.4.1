package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] profit = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long summa = service.calculateSum(profit);
        System.out.println(summa);

        System.out.println(service.findMiddle(profit));

        System.out.println(service.findMax(profit));

        System.out.println(service.findMin(profit));

        System.out.println(service.findUnderMid(profit));

        System.out.println(service.findAboveMid(profit));






    }
}
