public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -2;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    private long min() {
        long min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            min = Math.min(min, sales[i]);
        }
        return min;
    }

    public long statistic() {
        long countOfSales = sales.length;
        long sumOfSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumOfSales += sales[i];
        }

        long statisticOfSales = sumOfSales - max() - min();
        return statisticOfSales;
    }
}


