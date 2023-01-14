public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{100, 250, 800, 600});

        System.out.println(salesManager.max());
        System.out.println("Усеченное среднее значение из списка продаж равно " + salesManager.statistic());
    }
}