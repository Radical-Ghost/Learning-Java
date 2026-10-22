// Question 1: Remove Specific Character.

// Sample Input 1 (Valid):

// hello world
// o

// Output:
// hell wrld

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String x = String.valueOf(sc.nextLine().charAt(0));

        System.out.println(s.replaceAll(x, ""));

    }
}
