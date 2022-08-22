package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSum () {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getSumOfAllSales(sales);
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldFindAverage () {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageOfAllSales(sales);
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldFindMaxMonth () {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSalesMonth(sales);
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldFindMinMonth () {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesMonth(sales);
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldFindQuantityOfMonthsWhenLessThanAverage () {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.SumOfMonthsLessThanAverage(sales);
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldFindQuantityOfMonthsWhenMoreThanAverage () {
        StatsService service = new StatsService();

        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.SumOfMonthsMoreThanAverage (sales);
        Assertions.assertEquals(expected,actual);
    }

}
