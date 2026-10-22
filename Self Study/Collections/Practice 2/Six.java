// 1. WAP in Java to add all the numbers inside a ArrayList.

// Sample Input
// 6
// 10 20 30 40 50 60

// Sample Ouput:
// 210
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter elements (space seperated): ");
        arr.addAll(Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::valueOf).toList());

        int sum = 0;
        for (int i : arr) sum += i;
       System.out.println(sum);
    }
}
