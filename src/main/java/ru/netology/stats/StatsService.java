package ru.netology.stats;

public class StatsService {

    public int getSumOfAllSales(int[] sales) {
        int SumOfSales = 0;
        for (int i = 0; i < sales.length; i++) {
            SumOfSales = SumOfSales + sales[i];
        }
        return SumOfSales;
    }

    public int averageOfAllSales(int[] sales) {
        return getSumOfAllSales(sales) / sales.length;
    }

    public int maxSalesMonth (int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales [maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth (int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales [minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int SumOfMonthsLessThanAverage (int [] sales) {
        int averageMonth =0;
        for (int sale : sales) {
            if (sale < averageOfAllSales(sales)) {
                averageMonth = averageMonth + 1;
            }
        }
        return averageMonth;
    }

    public int SumOfMonthsMoreThanAverage (int [] sales) {
        int averageMonth =0;
        for (int sale : sales) {
            if (sale > averageOfAllSales(sales)) {
                averageMonth = averageMonth + 1;
            }
        }
        return averageMonth;
    }
}
