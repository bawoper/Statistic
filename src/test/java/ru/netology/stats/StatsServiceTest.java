package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test

    public void testSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testAvarageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.avarageSale(sales);
        long expected = 180 / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthMax() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMaxSale(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthMin() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthMinSale(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void testmonthSaleDown() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthSaleDown(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testmonthSaleUp() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.monthSaleUp(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}