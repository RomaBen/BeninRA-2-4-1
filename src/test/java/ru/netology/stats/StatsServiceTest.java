package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldBeOneHundredEightyIfSumOfWholeArray() {
        StatsService service = new StatsService();

        // Preparations:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        // Producing tested method:
        long actual = service.allSalesSum(sales);

        // Comparing expected and actual result:
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeFifteenIfCalculatingAverageSumOfSales() {
        StatsService service = new StatsService();

        // Preparations:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        // Producing tested method:
        long actual = service.averageSalesPerMonth(sales);

        // Comparing expected and actual result:
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeEightWhenCalculatingMaximumSalesMonth() {
        StatsService service = new StatsService();

        // Preparations:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        // Producing tested method:
        long actual = service.maxSales(sales);

        // Comparing expected and actual result:
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeNineWhenCalculatingMinSalesMonth() {
        StatsService service = new StatsService();

        // Preparations:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        // Producing tested method:
        long actual = service.minSales(sales);

        // Comparing expected and actual result:
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeFiveIfCalculatingTheNumberOfMonthsWhereSalesIsLessThanAverage() {
        StatsService service = new StatsService();

        // Preparations:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        // Producing tested method:
        long actual = service.numberOfLessThanAverage(sales);

        // Comparing expected and actual result:
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeFiveIfCalculatingTheNumberOfMonthsWhereSalesIsMoreThanAverage() {
        StatsService service = new StatsService();

        // Preparations:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        // Producing tested method:
        long actual = service.numberOfMoreThanAverage(sales);

        // Comparing expected and actual result:
        assertEquals(expected, actual);
    }
}