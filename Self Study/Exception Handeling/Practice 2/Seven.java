import java.util.Scanner;

public class Seven {

    public static double calculateSum(int[] arr) {
        double sum = 0.0;

        for (int val : arr) {
            if (val != 0) {
                sum += 1.0 / (val * val);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.printf("%.3f", calculateSum(arr));

        } catch (Exception e) {
            System.out.println("Invalid Try");
        }
    }
}
