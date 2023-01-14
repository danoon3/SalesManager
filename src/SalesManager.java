public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    private int min() {
        int min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            min = Math.min(min, sales[i]);
        }
        return min;
    }

    public int statistic() {
        int countOfSales = sales.length;
        int sumOfSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumOfSales += sales[i];
        }

        int statisticOfSales = sumOfSales - max() - min();
        return statisticOfSales;
    }
}


