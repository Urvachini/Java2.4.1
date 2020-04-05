package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    void shouldCalculatedSum() {
        StatsService service = new StatsService();
        long[] profit = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long summa = service.calculateSum(profit);


        assertEquals(180, summa);
    }

    @Test
    void shouldCalculatedMiddle() {
        StatsService service = new StatsService();
        long[] profit = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long middle = service.findMiddle(profit);


        assertEquals(15, middle);

    }

    @Test
    void shouldCalculatedMax() {
        StatsService service = new StatsService();
        long[] profit = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long max = service.findMax(profit);


        assertEquals(6, max);
    }

    @Test
    void shouldCalculatedMin() {
        StatsService service = new StatsService();
        long[] profit = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long min = service.findMin(profit);


        assertEquals(9, min);
    }

    @Test
    void shouldCalculatedUnderMid() {
        StatsService service = new StatsService();
        long[] profit = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long underMid = service.findUnderMid(profit);


        assertEquals(5, underMid);
    }

    @Test
    void shouldCalculatedAboveMid() {
        StatsService service = new StatsService();
        long[] profit = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long aboveMid = service.findAboveMid(profit);


        assertEquals(5, aboveMid);
    }

}