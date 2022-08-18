package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumMonths = 0;
        for (int sale : sales) {
            sumMonths += sale;
        }
        return sumMonths;
    }

    public int argSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowArgSales(int[] sales) {
        int belowArgMonth = 0;
        for (int sale : sales) {
            if (argSales(sales) > sale) {
                belowArgMonth++;
            }
        }
        return belowArgMonth;
    }

    public int aboveArgSales(int[] sales) {
        int aboveArgMonth = 0;
        for (int sale : sales) {
            if (argSales(sales) < sale) {
                aboveArgMonth++;
            }
        }
        return aboveArgMonth;
    }
}

