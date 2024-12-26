package ru.netology.service;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {
        long sum = 0;

        for (long num : sales) {
            sum += num;
        }
        return (int) sum;
    }

    public int avgSales(long[] sales) {
            long sum = sumSales(sales);
            long avg = sum / 12;
        return (int) avg;
        }

    public int belowAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count = 0; // счётчик месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) count++;
        }
        return count;

    }

    public int aboveAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count = 0; // счётчик месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) count++;
        }
        return count;

    }
}
