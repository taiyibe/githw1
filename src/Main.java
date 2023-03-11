public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{500, 1000, 5000, 50};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println(max);
    }
}
