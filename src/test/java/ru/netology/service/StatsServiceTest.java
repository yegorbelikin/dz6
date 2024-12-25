package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedmin = 9;
        long actualmin = service.minSales(sales);

        Assertions.assertEquals(expectedmin, actualmin);
    }
    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedmax = 8;
        long actualmax = service.maxSales(sales);

        Assertions.assertEquals(expectedmax, actualmax);
    }

    @Test
    public void SumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedsum = 180;
        long actualsum = service.SumSales(sales);

        Assertions.assertEquals(expectedsum, actualsum);
    }
    @Test
    public void AvgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedsvg = 15;
        long actualavg = service.AvgSales(sales);

        Assertions.assertEquals(expectedsvg, actualavg);
    }

    @Test
    public void BelowAvgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedb = 5;
        long actualb = service.BelowAvgSales(sales);

        Assertions.assertEquals(expectedb, actualb);
    }

    @Test
    public void AboveAvgSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedabv = 5;
        long actualabv = service.AboveAvgSales(sales);

        Assertions.assertEquals(expectedabv, actualabv);
    }

}
