public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{500, 1000, 5000, 50};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);
    }
}
