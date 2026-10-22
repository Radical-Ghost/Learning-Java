public class Two {
    public static void calculateAverage(int[] arr) {
        try {
            int sum = 0;
            for (int a : arr) sum += a;
            sum /= arr.length;
            System.out.println(sum);
        } catch (ArithmeticException ar) {
            System.out.println("Error: Division by zero");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30};
        calculateAverage(arr);
        calculateAverage(new int[]{});
    }
}
