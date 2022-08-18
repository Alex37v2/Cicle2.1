package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expected = 182;

        int actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void argSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.argSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void maxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void belowArgSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowArgSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void aboveArgSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 18, 15, 17, 22, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveArgSales(sales);
        assertEquals(expected, actual);
    }
}