public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{100, 250, 800, 600});

        System.out.println(salesManager.max());
    }
}