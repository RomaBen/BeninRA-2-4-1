package ru.netology.stats;

public class StatsService {

    public long allSalesSum (long[] sales) {
        int month = 0;
        long saleSum = 0;
        for (long sale : sales) {
            saleSum = saleSum + sales[month];
            month++;
        }
        return saleSum;
    }

    public long averageSalesPerMonth (long[] sales) {
        int month = 0;
        long averageSalesPM = 0;
        for (long sale : sales) {
            averageSalesPM = averageSalesPM + sales[month];
            month++;
        }
        averageSalesPM = averageSalesPM / sales.length;
        return averageSalesPM;
    }

// Example:
    public long minSales(long[] sales) {
        int minMonth = 0, month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth])
                minMonth = month;
            month++;
        }
        return minMonth + 1;
    }
// End of example.

    public long maxSales(long[] sales) {
      int maxMonth = 0, month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth])
                maxMonth = month;
            month++;
        }
        return  maxMonth + 1;
    }

    public long numberOfMoreThanAverage(long[] sales) {
        int moreThanAverage = 0;
        long average = averageSalesPerMonth(sales);
        for (long sale : sales) {
            if (sale > average)
                moreThanAverage++;
        }
        return moreThanAverage;
    }

    public long numberOfLessThanAverage(long[] sales) {
        int lessThanAverage = 0;
        long average = averageSalesPerMonth(sales);
        for (long sale : sales) {
            if (sale < average)
                lessThanAverage++;
        }
        return lessThanAverage;
    }
}
