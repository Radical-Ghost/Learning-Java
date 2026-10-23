// 1. WAP in java to check for a pattern in a given list of patterns and once verified return the list of patterns.

// The pattern contains:
// - The first character should be a lowercase alphabet
// - The second character should be a number
// - The third character should be a uppercase alphabet
// - The fourth character should be a number
// - The fifth character should be a lowercase alphabet


// Sample Input:
// 6
// a1B2c
// d11D3
// b2R4f
// 1D2g2
// g2T6h
// h7J5i

// Sample Output:
// a1B2c
// b2R4f
// g2T6h
// h7J5i

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] tokens = new String[n];

        for (int i = 0; i < n; i++) tokens[i] = sc.nextLine();

        String regex = "[a-z][0-9][A-Z][0-9][a-z]";

        System.out.println();

        for (int i = 0; i < n; i++) if (tokens[i].matches(regex)) System.out.println(tokens[i]);

        sc.close();
    }
}
