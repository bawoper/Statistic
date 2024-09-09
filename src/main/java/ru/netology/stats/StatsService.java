package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;

    }

    public long avarageSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long avarage = totalSale / sales.length;
        return avarage;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMax] <= sales[i]) {
                monthMax = i;

            }

        }
        return monthMax + 1;

    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMin] >= sales[i]) {
                monthMin = i;

            }

        }
        return monthMin + 1;
    }


    public int monthSaleDown(long[] sales) {
        int counter = 0;
        long avarage = avarageSale(sales);
        for (long sale : sales) {
            if (sale < avarage) {
                counter++;

            }
        }
        return counter;
    }

    public int monthSaleUp(long[] sales) {
        int counter = 0;
        long avarage = avarageSale(sales);
        for (long sale : sales) {
            if (sale > avarage) {
                counter++;

            }
        }
        return counter;
    }
}
